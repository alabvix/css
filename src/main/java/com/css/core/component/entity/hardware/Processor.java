package com.css.core.component.entity.hardware;

public record Processor(
        SocketTypeEnum socket,
        Double clock,
        Integer threads,
        Integer cores,
        Integer energyConsumption) implements Hardware {}