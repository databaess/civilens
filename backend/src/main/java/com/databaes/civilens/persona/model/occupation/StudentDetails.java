package com.databaes.civilens.persona.model.occupation;

import com.databaes.civilens.common.enums.student.EducationLevel;
import com.databaes.civilens.common.enums.student.InstitutionType;
import com.databaes.civilens.common.enums.student.StreamType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "Details specific to student occupation")
public class StudentDetails extends OccupationDetails {

    @NotNull
    @Schema(description = "Current education level", requiredMode = Schema.RequiredMode.REQUIRED)
    private EducationLevel educationLevel;

    @NotNull
    @Schema(description = "Type of educational institution", requiredMode = Schema.RequiredMode.REQUIRED)
    private InstitutionType institutionType;

    @NotNull
    @Schema(description = "Academic stream or field of study", requiredMode = Schema.RequiredMode.REQUIRED)
    private StreamType stream;
}
