package com.css.core.component.entity;

import java.math.BigDecimal;

public class Component {

    private Integer id;

    private String name;

    private BigDecimal price;

    private int quantity;

    private ComponentType type;

    private SocketType socket;

    public Component(Integer id, String name, BigDecimal price, int quantity, ComponentType type, SocketType socket) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.type = type;
        this.price = price;
        this.socket = socket;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ComponentType getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public SocketType getSocket() {
        return socket;
    }

    public BigDecimal calculateTotalValue() {
        return this.price.multiply(new BigDecimal(this.quantity));
    }
}
