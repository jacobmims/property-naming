package com.example;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class EmailContact {
    @Schema
    @Min(0)
    @NotNull
    private Long contactId;

    @Schema
    private String name;

    @Schema
    @NotNull
    private String emailAddress;
}
