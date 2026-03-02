package com.databaes.civilens.persona.model;

import com.databaes.civilens.common.enums.core.Category;
import com.databaes.civilens.common.enums.core.Gender;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "Demographic information of a persona")
public class Demographics {

    @Min(0)
    @Max(150)
    @Schema(description = "Age of the person", minimum = "0", maximum = "150", requiredMode = Schema.RequiredMode.REQUIRED)
    private int age;

    @NotNull
    @Schema(description = "Gender of the person", requiredMode = Schema.RequiredMode.REQUIRED)
    private Gender gender;

    @NotNull
    @Schema(description = "Social category", requiredMode = Schema.RequiredMode.REQUIRED)
    private Category category;

    @Min(1)
    @Schema(description = "Number of family members", minimum = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private int familySize;
}
