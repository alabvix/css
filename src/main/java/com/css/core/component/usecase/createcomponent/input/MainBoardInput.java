package com.css.core.component.usecase.createcomponent.input;

import com.css.core.component.domain.hardware.SocketTypeEnum;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

public record MainBoardInput(
        @NotNull(message = "Socket must be informed.")
        SocketTypeEnum socket,
        boolean ecc,
        boolean raid,
        @NotNull(message = "Memory slots must be informed.")
        @Range(min = 4, max = 12, message = "Invalid slots. Must between 4 and 12.")
        Integer memorySlots,
        @NotNull(message = "Energy consumption must be informed.")
        Integer energyConsumption) {}