package com.databaes.civilens.persona.model.occupation;

import com.databaes.civilens.persona.model.enums.student.EducationLevel;
import com.databaes.civilens.persona.model.enums.student.InstitutionType;
import com.databaes.civilens.persona.model.enums.student.StreamType;

public class StudentDetails implements OccupationDetails {

    private EducationLevel educationLevel;
    private InstitutionType institutionType;
    private StreamType stream;
}
