package com.databaes.civilens.persona.model.embedded;

import com.databaes.civilens.persona.model.enums.farmer.LandUnit;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
@Schema(description = "Land holding information")
public class LandHolding {

    @Positive
    @Schema(description = "Numeric value of land holding", requiredMode = Schema.RequiredMode.REQUIRED)
    private double value;

    @NotNull
    @Schema(description = "Unit of measurement for land", requiredMode = Schema.RequiredMode.REQUIRED)
    private LandUnit unit;
}
