package com.css.core.component.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ComponentValidator.class)
//@Target( {ElementType.RECORD_COMPONENT, ElementType.FIELD })
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ComponentValidatorConstraint {
    String message() default "Component type does not match component hardware";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
