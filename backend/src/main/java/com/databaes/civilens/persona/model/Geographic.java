package com.databaes.civilens.persona.model;

import com.databaes.civilens.common.enums.core.AreaType;
import com.databaes.civilens.common.enums.core.IndianState;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "Geographic information of a persona")
public class Geographic {

    @NotNull
    @Schema(description = "Indian state or union territory", requiredMode = Schema.RequiredMode.REQUIRED)
    private IndianState state;

    @NotBlank
    @Schema(description = "District name", requiredMode = Schema.RequiredMode.REQUIRED)
    private String district;

    @NotNull
    @Schema(description = "Type of area (urban/rural)", requiredMode = Schema.RequiredMode.REQUIRED)
    private AreaType areaType;
}
