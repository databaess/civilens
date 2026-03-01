package com.databaes.civilens.persona.model.occupation;

import com.databaes.civilens.persona.model.enums.worker.AnnualTurnoverBracket;
import com.databaes.civilens.persona.model.enums.worker.EnterpriseSize;
import com.databaes.civilens.persona.model.enums.worker.Sector;

public class SelfEmployedDetails implements OccupationDetails {

    private Sector sector;
    private int yearsOperational;
    private EnterpriseSize enterpriseSize;
    private AnnualTurnoverBracket annualTurnoverBracket;
}
