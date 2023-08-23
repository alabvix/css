package com.css.framework.component;

import com.css.core.component.usecase.createcomponent.CreateComponentUseCase;
import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;
import com.css.core.component.usecase.createcomponent.output.CreateComponentOutput;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ComponentService {

    private final CreateComponentUseCase createComponent;

    public ComponentService(CreateComponentUseCase createComponentUseCase) {
        this.createComponent = createComponentUseCase;
    }

    @Transactional
    public List<CreateComponentOutput> create(List<CreateComponentInput> componentInputList) {
        return createComponent.create(componentInputList);
    }

}