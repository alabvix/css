package com.css.core.component.entity.hardware;

public record PowerSupply(
        boolean fanLess,
        int efficiency,
        String output,
        int power) implements Hardware {}