package com.css.framework.component;

import com.css.core.component.usecase.createcomponent.CreateComponentUseCase;
import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentService {

    private final CreateComponentUseCase createComponent;

    public ComponentService(CreateComponentUseCase createComponentUseCase) {
        this.createComponent = createComponentUseCase;
    }

    public void create(List<CreateComponentInput> componentInputList) {
        createComponent.create(componentInputList);
    }
}