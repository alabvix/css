package com.css.framework.component.entity;


import com.css.core.component.domain.ComponentTypeEnum;
import com.css.core.component.domain.ManufacturerEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="component")
public class ComponentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private ComponentTypeEnum type;
    private BigDecimal price;
    private ManufacturerEnum manufacturer;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mainboard_id")
    private MainBoardEntity mainBoard;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "processor_id")
    private ProcessorEntity processor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "power_supply_id")
    private PowerSupplyEntity powerSupply;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "graphic_card_id")
    private GraphicCardEntity graphicCard;

    public MainBoardEntity getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoardEntity mainBoard) {
        this.mainBoard = mainBoard;
    }

    public ProcessorEntity getProcessor() {
        return processor;
    }

    public void setProcessor(ProcessorEntity processor) {
        this.processor = processor;
    }

    public PowerSupplyEntity getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupplyEntity powerSupply) {
        this.powerSupply = powerSupply;
    }

    public GraphicCardEntity getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCardEntity graphicCard) {
        this.graphicCard = graphicCard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentTypeEnum getType() {
        return type;
    }

    public void setType(ComponentTypeEnum type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ManufacturerEnum getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerEnum manufacturer) {
        this.manufacturer = manufacturer;
    }
}
