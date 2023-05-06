package com.css.core.component.usecase.createcomponent;

import com.css.core.component.entity.ComponentType;
import com.css.core.component.entity.SocketType;

import java.math.BigDecimal;

public class CreateComponentInput {

    public final String name;

    public final BigDecimal price;

    public final int quantity;

    public final ComponentType type;

    public final SocketType socket;

    public CreateComponentInput(String name, BigDecimal price, int quantity, ComponentType type, SocketType socket) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
        this.socket = socket;
    }

    public CreateComponentInput(String name, BigDecimal price, int quantity, ComponentType type) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
        this.socket = SocketType.NOT_APPLICABLE;
    }
}
