package com.databaes.civilens.persona.model;

import com.databaes.civilens.persona.model.enums.core.Language;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Document(collection = "personas")
@Schema(description = "Persona entity representing an individual's demographic, economic, geographic, and occupational information")
public class Persona {

    @Id
    @Schema(description = "Unique identifier for the persona", accessMode = Schema.AccessMode.READ_ONLY)
    private String id;

    @NotNull
    @Schema(description = "Preferred language for communication", requiredMode = Schema.RequiredMode.REQUIRED)
    private Language language;

    @NotNull
    @Valid
    @Schema(description = "Demographic information including age, gender, category, and family size", requiredMode = Schema.RequiredMode.REQUIRED)
    private Demographics demographics;

    @NotNull
    @Valid
    @Schema(description = "Economic information including income bracket and BPL status", requiredMode = Schema.RequiredMode.REQUIRED)
    private Economic economic;

    @NotNull
    @Valid
    @Schema(description = "Geographic information including state, district, and area type", requiredMode = Schema.RequiredMode.REQUIRED)
    private Geographic geographic;

    @NotNull
    @Valid
    @Schema(description = "Occupation information including type and specific details", requiredMode = Schema.RequiredMode.REQUIRED)
    private Occupation occupation;

    @Schema(description = "Metadata information", accessMode = Schema.AccessMode.READ_ONLY)
    private Instant meta;
}
