package com.css.framework.component.entity;

import com.css.core.component.domain.hardware.SocketTypeEnum;
import jakarta.persistence.*;

@Entity
@Table(name="processor")
public class ProcessorEntity {
    @Id
    private Integer id;

    @Enumerated(EnumType.STRING)
    private SocketTypeEnum socket;

    private Double clock;

    private Integer threads;

    private Integer cores;

    private Integer energyConsumption;

    @OneToOne
    @MapsId
    @JoinColumn(name = "component_id")
    private ComponentEntity component;

    public ProcessorEntity(SocketTypeEnum socket,
                           Double clock,
                           Integer threads,
                           Integer cores,
                           Integer energyConsumption,
                           ComponentEntity component) {
        this.socket = socket;
        this.clock = clock;
        this.threads = threads;
        this.cores = cores;
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

    public SocketTypeEnum getSocket() {
        return socket;
    }

    public void setSocket(SocketTypeEnum socket) {
        this.socket = socket;
    }

    public Double getClock() {
        return clock;
    }

    public void setClock(Double clock) {
        this.clock = clock;
    }

    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public Integer getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Integer energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
}
