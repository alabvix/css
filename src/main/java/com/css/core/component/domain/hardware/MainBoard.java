package com.css.core.component.domain.hardware;

public record MainBoard(
        SocketTypeEnum socket,
        boolean ecc,
        boolean raid,
        Integer memorySlots,
        Integer energyConsumption) implements Hardware {

}