package com.css.framework.component;

import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;

import java.util.List;

public class ComponentPayload {
    private List<CreateComponentInput> components;

    public List<CreateComponentInput> getComponents() {
        return components;
    }

    public void setComponents(List<CreateComponentInput> components) {
        this.components = components;
    }
}
