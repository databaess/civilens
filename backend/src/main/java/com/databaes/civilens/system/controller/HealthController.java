package com.databaes.civilens.system.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    @Operation(summary = "Health check", description = "Returns the service health status")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Service is healthy", content = @Content)
    })
    public String healthCheck() {
        return "OK";
    }
}
