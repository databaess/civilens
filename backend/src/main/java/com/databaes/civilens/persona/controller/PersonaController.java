package com.databaes.civilens.persona.controller;

import com.databaes.civilens.persona.model.Persona;
import com.databaes.civilens.persona.service.PersonaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@Tag(name = "Persona Management", description = "APIs for managing persona data")
public class PersonaController {

    private final PersonaService personaServiceImpl;

    public PersonaController(PersonaService personaServiceImpl) {
        this.personaServiceImpl = personaServiceImpl;
    }

    @PostMapping
    @Operation(summary = "Create a new persona", description = "Creates a new persona with demographic, economic, geographic, and occupation information")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Persona created successfully", content = @Content),
            @ApiResponse(responseCode = "400", description = "Invalid input data", content = @Content)
    })
    public ResponseEntity<Void> createPersona(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Persona object to be created", required = true, content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Persona.class), examples = {
                    @ExampleObject(name = "Farmer Persona", value = """
                            {
                                "language": "EN",
                                "demographics": {
                                    "age": 35,
                                    "gender": "MALE",
                                    "category": "GENERAL",
                                    "familySize": 4
                                },
                                "economic": {
                                    "incomeBracket": "ONE_TO_3L",
                                    "bplStatus": false
                                },
                                "geographic": {
                                    "state": "KARNATAKA",
                                    "district": "Bangalore",
                                    "areaType": "RURAL"
                                },
                                "occupation": {
                                    "type": "FARMER",
                                    "details": {
                                        "landHolding": {
                                            "value": 2.5,
                                            "unit": "ACRE"
                                        },
                                        "irrigationType": "RAINFED",
                                        "primaryCropCategory": "FOODGRAIN"
                                    }
                                }
                            }
                            """),
                    @ExampleObject(name = "Student Persona", value = """
                            {
                                "language": "HI",
                                "demographics": {
                                    "age": 20,
                                    "gender": "FEMALE",
                                    "category": "OBC",
                                    "familySize": 5
                                },
                                "economic": {
                                    "incomeBracket": "ZERO_TO_1L",
                                    "bplStatus": true
                                },
                                "geographic": {
                                    "state": "MAHARASHTRA",
                                    "district": "Pune",
                                    "areaType": "URBAN"
                                },
                                "occupation": {
                                    "type": "STUDENT",
                                    "details": {
                                        "educationLevel": "UG",
                                        "institutionType": "GOVERNMENT",
                                        "stream": "ENGINEERING"
                                    }
                                }
                            }
                            """),
                    @ExampleObject(name = "Worker Persona", value = """
                            {
                                "language": "KN",
                                "demographics": {
                                    "age": 28,
                                    "gender": "MALE",
                                    "category": "SC",
                                    "familySize": 3
                                },
                                "economic": {
                                    "incomeBracket": "ONE_TO_3L",
                                    "bplStatus": false
                                },
                                "geographic": {
                                    "state": "TAMIL_NADU",
                                    "district": "Chennai",
                                    "areaType": "URBAN"
                                },
                                "occupation": {
                                    "type": "WORKER",
                                    "details": {
                                        "employmentCategory": "ORGANISED",
                                        "industryType": "MANUFACTURING",
                                        "isMigrantWorker": false
                                    }
                                }
                            }
                            """),
                    @ExampleObject(name = "Self-Employed Persona", value = """
                            {
                                "language": "EN",
                                "demographics": {
                                    "age": 42,
                                    "gender": "FEMALE",
                                    "category": "GENERAL",
                                    "familySize": 4
                                },
                                "economic": {
                                    "incomeBracket": "THREE_TO_5L",
                                    "bplStatus": false
                                },
                                "geographic": {
                                    "state": "GUJARAT",
                                    "district": "Ahmedabad",
                                    "areaType": "URBAN"
                                },
                                "occupation": {
                                    "type": "SELF_EMPLOYED",
                                    "details": {
                                        "sector": "SERVICES",
                                        "yearsOperational": 5,
                                        "enterpriseSize": "MEDIUM",
                                        "annualTurnoverBracket": "TEN_TO_50L"
                                    }
                                }
                            }
                            """)
            })) @Valid @RequestBody Persona persona) {
        personaServiceImpl.createPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
