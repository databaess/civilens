package com.databaes.civilens.persona.model;

import com.databaes.civilens.persona.model.enums.core.OccupationType;
import com.databaes.civilens.persona.model.occupation.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "Occupation information of a persona")
public class Occupation {

    @NotNull
    @Schema(description = "Type of occupation. This determines which fields are available in 'details'.", requiredMode = Schema.RequiredMode.REQUIRED)
    private OccupationType type;

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = FarmerDetails.class, name = "FARMER"),
            @JsonSubTypes.Type(value = WorkerDetails.class, name = "WORKER"),
            @JsonSubTypes.Type(value = StudentDetails.class, name = "STUDENT"),
            @JsonSubTypes.Type(value = SelfEmployedDetails.class, name = "SELF_EMPLOYED")
    })
    @NotNull
    @Valid
    @Schema(oneOf = {
            FarmerDetails.class,
            WorkerDetails.class,
            StudentDetails.class,
            SelfEmployedDetails.class
    }, description = """
            Occupation-specific details. The structure of this object depends on the 'type' field:
            - FARMER: requires landHolding, irrigationType, primaryCropCategory
            - WORKER: requires employmentCategory, industryType, isMigrantWorker
            - STUDENT: requires educationLevel, institutionType, stream
            - SELF_EMPLOYED: requires sector, yearsOperational, enterpriseSize, annualTurnoverBracket
            """, requiredMode = Schema.RequiredMode.REQUIRED)
    private OccupationDetails details;
}
