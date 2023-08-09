package com.css.core.component.entity.hardware;

public record GraphicCard  (
        Integer totalMemory,
        boolean multiGpu,
        boolean rayTracing,
        Integer energyConsumption) implements Hardware
{}