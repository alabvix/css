package com.css.core.component.validation;

import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ComponentValidator implements ConstraintValidator<ComponentValidatorConstraint, CreateComponentInput> {
    @Override
    public void initialize(ComponentValidatorConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(CreateComponentInput input, ConstraintValidatorContext constraintValidatorContext) {
        return switch (input.type()) {
            case MAIN_BOARD -> input.mainBoard() != null;
            case PROCESSOR -> input.processor() != null;
            case GRAPHIC_CARD -> input.graphicCard() != null;
            case POWER_SUPPLY -> input.powerSupply() != null;
        };
    }
}