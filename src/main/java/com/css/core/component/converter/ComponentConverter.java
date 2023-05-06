package com.css.core.component.converter;

import com.css.core.component.entity.Component;
import com.css.core.component.usecase.createcomponent.CreateComponentInput;

import java.util.List;
import java.util.stream.Collectors;

public class ComponentConverter {

    public List<Component> toComponentList(List<CreateComponentInput> inputList) {
        return  inputList.stream().map( i -> new Component(0, i.name, i.price, i.quantity, i.type, i.socket))
                .collect(Collectors.toList());
    }
}
