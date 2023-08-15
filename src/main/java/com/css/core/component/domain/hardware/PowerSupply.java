package com.css.core.component.domain.hardware;

public record PowerSupply(
        boolean fanLess,
        Integer efficiency,
        String output,
        Integer power) implements Hardware {}