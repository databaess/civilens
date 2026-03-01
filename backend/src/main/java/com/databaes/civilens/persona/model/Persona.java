package com.databaes.civilens.persona.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Language;
import org.springframework.data.mongodb.core.query.Meta;

@Document(collection = "personas")
public class Persona {

    @Id
    private String id;

    private Language language;

    private Demographics demographics;

    private Economic economic;

    private Geographic geographic;

    private Occupation occupation;

    private Meta meta;
}
