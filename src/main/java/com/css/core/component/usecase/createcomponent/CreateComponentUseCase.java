package com.css.core.component.usecase.createcomponent;

import com.css.core.component.converter.ComponentConverter;
import com.css.core.component.entity.Component;
import com.css.core.component.gateway.ComponentGateway;

import java.util.List;

public class CreateComponentUseCase {

    private final ComponentGateway componentGateway;

    private final ComponentConverter componentConverter;

    public CreateComponentUseCase(ComponentGateway componentGateway, ComponentConverter componentConverter) {
        this.componentGateway = componentGateway;
        this.componentConverter = componentConverter;
    }

    public CreateComponentOutput create(List<CreateComponentInput> inputList) {

        final List<Component> components = componentConverter.toComponentList(inputList);

        for (Component c : components) {
            componentGateway.create(c);
        }


        return null;

    }

}
