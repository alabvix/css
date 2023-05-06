package com.css.core.component.entity;

import java.math.BigDecimal;

public class Component {

    private Integer id;

    private String name;

    private ComponentType type;

    private BigDecimal price;

    private SocketType socket;

    public Component(Integer id, String name, ComponentType type, BigDecimal price, SocketType socket) {
        this.id = id;
        this.name = name;
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
}
