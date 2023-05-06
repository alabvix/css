package com.css.core.component.usecase.createcomponent;

import com.css.core.component.entity.ComponentType;
import com.css.core.component.entity.SocketType;

import java.math.BigDecimal;

public class CreateComponentInput {

    public final String name;

    public final ComponentType type;

    public final BigDecimal price;

    public final SocketType socket;

    public CreateComponentInput(String name, ComponentType type, BigDecimal price, SocketType socket) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.socket = socket;
    }

    public CreateComponentInput(String name, ComponentType type, BigDecimal price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.socket = SocketType.NOT_APPLICABLE;
    }
}
