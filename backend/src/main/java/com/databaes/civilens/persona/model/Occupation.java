package com.databaes.civilens.persona.model;

import com.databaes.civilens.persona.model.occupation.*;
import com.databaes.civilens.persona.model.enums.core.OccupationType;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Occupation {

    private OccupationType type;

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type"
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = FarmerDetails.class, name = "farmer"),
            @JsonSubTypes.Type(value = WorkerDetails.class, name = "worker"),
            @JsonSubTypes.Type(value = StudentDetails.class, name = "student"),
            @JsonSubTypes.Type(value = SelfEmployedDetails.class, name = "self_employed")
    })
    private OccupationDetails details;
}
