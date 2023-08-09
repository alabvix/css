package com.css.core.component.validator;

import com.css.core.component.entity.ComponentTypeEnum;
import com.css.core.component.entity.ManufacturerEnum;
import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;
import com.css.core.component.usecase.createcomponent.input.ProcessorInput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateComponentValidatorTest {

    private final CreateComponentValidator validator = new CreateComponentValidator();

    @Test
    @DisplayName("Validate: given invalid processor must return validation messages")
    void validate_invalidProcessor_mustReturnValidationMessages(){
        final ProcessorInput processor = new ProcessorInput(
                null,
                0.0,
                0,
                0,
                0);
        final CreateComponentInput input = new CreateComponentInput(
                "AMD Ryzen 5 5600G",
                ComponentTypeEnum.PROCESSOR,
                ManufacturerEnum.AMD,
                new BigDecimal("849.00"),
                40,
                processor,
                null,
                null,
                null
        );

        final List<String> constrains = validator.validate(input);

        assertEquals(5, constrains.size());
        assertTrue(constrains.contains("Socket must be informed."));
        assertTrue(constrains.contains("Clock must be 1 or greater."));
        assertTrue(constrains.contains("Invalid threads. Must be 1 or greater."));
        assertTrue(constrains.contains("Invalid cores. Must be 1 or greater."));
        assertTrue(constrains.contains("Energy consumption must be 10 or greater."));
    }
}