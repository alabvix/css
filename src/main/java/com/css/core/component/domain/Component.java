package com.css.core.component.domain;

import com.css.core.component.domain.hardware.*;

import java.math.BigDecimal;

public class Component {
    private Integer id;

    public final String name;

    public final ComponentTypeEnum type;

    public final BigDecimal price;

    public final ManufacturerEnum manufacturer;

    public final Integer quantity;

    public final Hardware hardware;

    public Component(String name,
                     ComponentTypeEnum type,
                     BigDecimal price,
                     ManufacturerEnum manufacturer,
                     Integer quantity,
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

    public BigDecimal calcTotalValue() {
        return this.price.multiply(new BigDecimal(this.quantity));
    }

    public MainBoard getMainBoard(){
        if (this.hardware instanceof MainBoard){
            return (MainBoard) hardware;
        } else {
            throw new IllegalStateException("Hardware is not a MainBoard");
        }
    }

    public Processor getProcessor(){
        if (this.hardware instanceof Processor){
            return (Processor) hardware;
        } else {
            throw new IllegalStateException("Hardware is not a Processor");
        }
    }

    public PowerSupply getPowerSupply(){
        if (this.hardware instanceof PowerSupply){
            return (PowerSupply) hardware;
        } else {
            throw new IllegalStateException("Hardware is not a Power Supply");
        }
    }

    public GraphicCard getGraphicCard(){
        if (this.hardware instanceof GraphicCard){
            return (GraphicCard) hardware;
        } else {
            throw new IllegalStateException("Hardware is not a Graphic Card");
        }
    }
}
