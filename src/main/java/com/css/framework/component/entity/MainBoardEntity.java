package com.css.framework.component.entity;

import com.css.core.component.domain.hardware.SocketTypeEnum;
import jakarta.persistence.*;

@Entity
@Table(name="main_board")
public class MainBoardEntity {
    @Id
    private Integer id;

    @Enumerated(EnumType.STRING)
    private SocketTypeEnum socket;

    private boolean ecc;

    private boolean raid;

    private Integer memorySlots;

    private Integer energyConsumption;

    @OneToOne
    @MapsId
    @JoinColumn(name = "component_id")
    private ComponentEntity component;

    public MainBoardEntity(SocketTypeEnum socket,
                           boolean ecc,
                           boolean raid,
                           Integer memorySlots,
                           Integer energyConsumption,
                           ComponentEntity component) {
        this.socket = socket;
        this.ecc = ecc;
        this.raid = raid;
        this.memorySlots = memorySlots;
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

    public boolean isEcc() {
        return ecc;
    }

    public void setEcc(boolean ecc) {
        this.ecc = ecc;
    }

    public boolean isRaid() {
        return raid;
    }

    public void setRaid(boolean raid) {
        this.raid = raid;
    }

    public Integer getMemorySlots() {
        return memorySlots;
    }

    public void setMemorySlots(Integer memorySlots) {
        this.memorySlots = memorySlots;
    }

    public Integer getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Integer energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
}
