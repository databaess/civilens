package com.databaes.civilens.persona.model.occupation;

import com.databaes.civilens.persona.model.enums.worker.AnnualTurnoverBracket;
import com.databaes.civilens.persona.model.enums.worker.EnterpriseSize;
import com.databaes.civilens.persona.model.enums.worker.Sector;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "Details specific to self-employed occupation")
public class SelfEmployedDetails extends OccupationDetails {

    @NotNull
    @Schema(description = "Sector of operation", requiredMode = Schema.RequiredMode.REQUIRED)
    private Sector sector;

    @Min(0)
    @Schema(description = "Number of years the business has been operational", requiredMode = Schema.RequiredMode.REQUIRED)
    private int yearsOperational;

    @NotNull
    @Schema(description = "Size of the enterprise", requiredMode = Schema.RequiredMode.REQUIRED)
    private EnterpriseSize enterpriseSize;

    @NotNull
    @Schema(description = "Annual turnover bracket", requiredMode = Schema.RequiredMode.REQUIRED)
    private AnnualTurnoverBracket annualTurnoverBracket;
}
