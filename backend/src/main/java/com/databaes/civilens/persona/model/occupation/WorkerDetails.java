package com.databaes.civilens.persona.model.occupation;

import com.databaes.civilens.persona.model.enums.selfemplyed.EmploymentCategory;
import com.databaes.civilens.persona.model.enums.selfemplyed.IndustryType;

public class WorkerDetails implements OccupationDetails {

    private EmploymentCategory employmentCategory;
    private IndustryType industryType;
    private boolean isMigrantWorker;
}
