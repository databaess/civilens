package com.databaes.civilens.persona.model.occupation;

import com.databaes.civilens.persona.model.enums.selfemplyed.EmploymentCategory;
import com.databaes.civilens.persona.model.enums.selfemplyed.IndustryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "Details specific to worker occupation")
public class WorkerDetails extends OccupationDetails {

    @NotNull
    @Schema(description = "Employment category", requiredMode = Schema.RequiredMode.REQUIRED)
    private EmploymentCategory employmentCategory;

    @NotNull
    @Schema(description = "Type of industry", requiredMode = Schema.RequiredMode.REQUIRED)
    private IndustryType industryType;

    @NotNull
    @JsonProperty("isMigrantWorker")
    @Schema(description = "Whether the worker is a migrant worker", requiredMode = Schema.RequiredMode.REQUIRED)
    private Boolean migrantWorker;
}
