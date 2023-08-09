package com.css.core.component.usecase.createcomponent.input;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

public record PowerSupplyInput(
        boolean fanLess,
        @NotNull
        @Range(min = 70, message = "Invalid efficiency. Must be 70 or greater.")
        Integer efficiency,
        @NotNull(message = "Output is required.")
        @NotEmpty(message = "Output must not be empty.")
        String output,
        @NotNull(message = "Power is required.")
        @Range(min = 200, message = "Power most be 200 or greater.")
        Integer power) {}