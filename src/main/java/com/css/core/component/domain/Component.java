package com.css.core.component.domain;

import com.css.core.component.domain.hardware.Hardware;

import java.math.BigDecimal;

public class Component {
    private Integer id;
    public final String name;
    public final ComponentTypeEnum type;
    public final BigDecimal price;
    public final ManufacturerEnum manufacturer;
    public final int quantity;
    public final Hardware hardware;

    public Component(String name,
                     ComponentTypeEnum type,
                     BigDecimal price,
                     ManufacturerEnum manufacturer,
                     int quantity,
                     Hardware hardware) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.type = type;
        this.hardware = hardware;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
