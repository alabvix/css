package com.css.core.validator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GenericValidator<T> {

    public List<String> validate(T t) {

        final List<String> validationMessages = new ArrayList<>();

        jakarta.validation.Validator validator;
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()) {
            validator = factory.getValidator();
        }

        Set<ConstraintViolation<T>> violations = validator.validate(t);
        for (ConstraintViolation<T> violation : violations) {
            validationMessages.add(violation.getMessage());
        }

        return validationMessages;
    }

}
