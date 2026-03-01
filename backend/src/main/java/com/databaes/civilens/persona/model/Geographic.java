package com.databaes.civilens.persona.model;

import com.databaes.civilens.persona.model.enums.core.AreaType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "Geographic information of a persona")
public class Geographic {

    @NotBlank
    @Schema(description = "State name", requiredMode = Schema.RequiredMode.REQUIRED)
    private String state;

    @NotBlank
    @Schema(description = "District name", requiredMode = Schema.RequiredMode.REQUIRED)
    private String district;

    @NotNull
    @Schema(description = "Type of area (urban/rural)", requiredMode = Schema.RequiredMode.REQUIRED)
    private AreaType areaType;
}
