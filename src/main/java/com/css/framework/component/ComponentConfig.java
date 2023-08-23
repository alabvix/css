package com.css.framework.component;

import com.css.core.component.converter.ComponentConverter;
import com.css.core.component.usecase.createcomponent.CreateComponentUseCase;
import com.css.core.validator.GenericValidator;
import com.css.framework.component.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {

    @Autowired
    private ComponentRepository componentRepository;

    @Bean
    public CreateComponentUseCase createComponentUseCase(){
        return new CreateComponentUseCase(
                componentRepository,
                new ComponentConverter(),
                new GenericValidator<>()
        );
    }
}