package com.css.core.component.domain.hardware;

public record Processor(
        SocketTypeEnum socket,
        Double clock,
        Integer threads,
        Integer cores,
        Integer energyConsumption) implements Hardware {}