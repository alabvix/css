package com.css.framework.component.entity;

import jakarta.persistence.*;

@Entity
@Table(name="graphic_card")
public class GraphicCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer totalMemory;
    private boolean multiGpu;
    private boolean rayTracing;
    private Integer energyConsumption;

    @OneToOne(mappedBy = "graphicCard")
    private ComponentEntity component;

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

    public Integer getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(Integer totalMemory) {
        this.totalMemory = totalMemory;
    }

    public boolean isMultiGpu() {
        return multiGpu;
    }

    public void setMultiGpu(boolean multiGpu) {
        this.multiGpu = multiGpu;
    }

    public boolean isRayTracing() {
        return rayTracing;
    }

    public void setRayTracing(boolean rayTracing) {
        this.rayTracing = rayTracing;
    }

    public Integer getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Integer energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
}
