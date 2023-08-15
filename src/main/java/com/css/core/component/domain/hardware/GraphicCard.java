package com.css.core.component.domain.hardware;

public record GraphicCard  (
        Integer totalMemory,
        boolean multiGpu,
        boolean rayTracing,
        Integer energyConsumption) implements Hardware{}