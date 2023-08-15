package com.css.framework.component.entity;

import jakarta.persistence.*;

@Entity
@Table(name="power_supply")
public class PowerSupplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private boolean fanLess;

    private Integer efficiency;

    private String output;

    private Integer power;

    @OneToOne
    @PrimaryKeyJoinColumn
    private ComponentEntity component;

    public PowerSupplyEntity(boolean fanLess,
                             Integer efficiency,
                             String output,
                             Integer power,
                             ComponentEntity component) {
        this.fanLess = fanLess;
        this.efficiency = efficiency;
        this.output = output;
        this.power = power;
        this.component = component;
    }

    public ComponentEntity getComponent() {
        return component;
    }

    public void setComponent(ComponentEntity component) {
        this.component = component;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isFanLess() {
        return fanLess;
    }

    public void setFanLess(boolean fanLess) {
        this.fanLess = fanLess;
    }

    public Integer getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Integer efficiency) {
        this.efficiency = efficiency;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
