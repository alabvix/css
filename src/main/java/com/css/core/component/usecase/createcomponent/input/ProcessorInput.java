package com.css.core.component.usecase.createcomponent.input;

import com.css.core.component.domain.hardware.SocketTypeEnum;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

public record ProcessorInput(
        @NotNull(message = "Socket must be informed.")
        SocketTypeEnum socket,
        @NotNull(message = "Clock must be present.")
        @Range(min = 1, message = "Clock must be 1 or greater.")
        Double clock,
        @NotNull(message = "Number of threads must be informed.")
        @Range(min = 1, message = "Invalid threads. Must be 1 or greater.")
        Integer threads,
        @NotNull(message = "Number of cores must be informed.")
        @Range(min = 1, message = "Invalid cores. Must be 1 or greater.")
        Integer cores,
        @NotNull(message = "Energy consumption must be informed.")
        @Range(min = 10, message = "Energy consumption must be 10 or greater.")
        Integer energyConsumption) {
}