package com.css.core.validator;

import com.css.core.component.domain.ComponentTypeEnum;
import com.css.core.component.domain.ManufacturerEnum;
import com.css.core.component.domain.hardware.SocketTypeEnum;
import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;
import com.css.core.component.usecase.createcomponent.input.MainBoardInput;
import com.css.core.component.usecase.createcomponent.input.ProcessorInput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenericValidatorCreateComponentInputTest {

    private final GenericValidator<CreateComponentInput> validator = new GenericValidator<>();

    @Test
    @DisplayName("Validate: given a processor component with a processor with zero and null fields must return validation messages")
    void validate_invalidProcessor_mustReturnValidationMessages(){
        final ProcessorInput processor = new ProcessorInput(
                null,
                0.0,
                0,
                0,
                0);
        final CreateComponentInput input = new CreateComponentInput(
                "AMD Ryzen 5 5600G",
                ManufacturerEnum.AMD,
                ComponentTypeEnum.PROCESSOR,
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

    @Test
    @DisplayName("Validate: given a processor component with a diferent hardware must return validation messages")
    void validate_invalidComponentType_mustReturnValidationMessages(){
        final MainBoardInput mainBoard = new MainBoardInput(
                SocketTypeEnum.LGA,
                false,
                false,
                2,
                50
        );
        final CreateComponentInput input = new CreateComponentInput(
                "AMD Ryzen 5 5600G",
                ManufacturerEnum.AMD,
                ComponentTypeEnum.PROCESSOR,
                new BigDecimal("849.00"),
                40,
                null,
                mainBoard,
                null,
                null
        );

        final List<String> constrains = validator.validate(input);

        assertEquals(2, constrains.size());
        assertTrue(constrains.contains("Component type does not match component hardware"));
        assertTrue(constrains.contains("Invalid slots. Must between 4 and 12."));
    }
}