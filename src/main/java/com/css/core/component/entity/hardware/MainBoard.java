package com.css.core.component.entity.hardware;

public record MainBoard(
        SocketTypeEnum socket,
        boolean ecc,
        boolean raid,
        Integer memorySlots,
        Integer energyConsumption) implements Hardware {
    public MainBoard(SocketTypeEnum socket, boolean ecc, boolean raid, Integer memorySlots, Integer energyConsumption) {
        this.socket = socket;
        this.ecc = ecc;
        this.raid = raid;
        this.memorySlots = memorySlots;
        this.energyConsumption = energyConsumption;
    }
}