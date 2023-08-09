package com.css.core.component.validator;

import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CreateComponentValidator {
    public List<String> validate(CreateComponentInput componentInput) {
        final List<String> validationMessages = new ArrayList<>();

        Validator validator;
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            validator = factory.getValidator();
        }

        Set<ConstraintViolation<CreateComponentInput>> violations = validator.validate(componentInput);
        for (ConstraintViolation<CreateComponentInput> violation : violations) {
            validationMessages.add(violation.getMessage());
        }

        return validationMessages;
    }
}
