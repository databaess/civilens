package com.databaes.civilens.persona.model;

import com.databaes.civilens.persona.model.enums.core.IncomeBracket;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "Economic information of a persona")
public class Economic {

    @NotNull
    @Schema(description = "Income bracket of the person", requiredMode = Schema.RequiredMode.REQUIRED)
    private IncomeBracket incomeBracket;

    @Schema(description = "Below Poverty Line status", requiredMode = Schema.RequiredMode.REQUIRED)
    private boolean bplStatus;
}
