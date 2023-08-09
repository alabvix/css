package com.css.core.component.usecase.createcomponent.input;

public record GraphicCardInput(
        Integer totalMemory,
        boolean multiGpu,
        boolean rayTracing,
        Integer energyConsumption) {}