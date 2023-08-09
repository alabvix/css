package com.css.core.component.usecase.createcomponent.input;

import com.css.core.component.entity.ComponentTypeEnum;
import com.css.core.component.entity.ManufacturerEnum;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

public record CreateComponentInput(
        @NotNull(message = "Invalid name.")
        @NotEmpty(message = "Invalid name.")
        String name,
        @NotNull(message = "Component type must be informed.")
        ComponentTypeEnum type,
        @NotNull(message = "Manufacturer must be informed.")
        ManufacturerEnum manufacturer,
        @NotNull(message = "Invalid price.")
        @Range(min = 50, message = "Invalid price Must be 50 or greater.")
        BigDecimal price,
        @Range(min = 1, message = "Invalid quantity. Must be 1 or greater")
        Integer quantity,
        @Valid
        ProcessorInput processor,
        @Valid
        MainBoardInput mainBoard,
        @Valid PowerSupplyInput powerSupply,
        @Valid GraphicCardInput graphicCard) {}