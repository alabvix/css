package com.css.framework.component.entity;

import com.css.core.component.domain.hardware.Hardware;
import jakarta.persistence.*;

@Entity
@Table(name="graphic_card")
public class GraphicCardEntity {

    @Id
    private Integer id;

    private Integer totalMemory;

    private boolean multiGpu;

    private boolean rayTracing;

    private Integer energyConsumption;

    @OneToOne
    @MapsId
    @JoinColumn(name = "component_id")
    private ComponentEntity component;

    public GraphicCardEntity(Integer totalMemory,
                             boolean multiGpu,
                             boolean rayTracing,
                             Integer energyConsumption,
                             ComponentEntity component) {
        this.totalMemory = totalMemory;
        this.multiGpu = multiGpu;
        this.rayTracing = rayTracing;
        this.energyConsumption = energyConsumption;
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
