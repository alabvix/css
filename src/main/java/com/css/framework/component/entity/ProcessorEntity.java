package com.css.framework.component.entity;

import com.css.core.component.domain.hardware.SocketTypeEnum;
import jakarta.persistence.*;

@Entity
@Table(name="processor")
public class ProcessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private SocketTypeEnum socket;
    private Double clock;
    private Integer threads;
    private Integer cores;
    private Integer energyConsumption;

    @OneToOne(mappedBy = "processor")
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
