package com.css.core.component.converter;

import com.css.core.component.entity.Component;
import com.css.core.component.entity.ComponentTypeEnum;
import com.css.core.component.entity.ManufacturerEnum;
import com.css.core.component.entity.hardware.SocketTypeEnum;
import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;
import com.css.core.component.usecase.createcomponent.input.MainBoardInput;
import com.css.core.component.usecase.createcomponent.input.ProcessorInput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComponentConverterTest {

    private final ComponentConverter componentConverter = new ComponentConverter();

    @Test
    @DisplayName("")
    public void toComponentList_givenMainBoardInput_() {
        final MainBoardInput mainBoardInput = new MainBoardInput(
                SocketTypeEnum.LGA,
                false,
                true,
                4,
                120
        );
        final CreateComponentInput componentMainBoard = new CreateComponentInput(
                "Asus Prime B450M",
                ComponentTypeEnum.MAIN_BOARD,
                ManufacturerEnum.ASUS,
                new BigDecimal("560.33"),
                10,
                null,
                mainBoardInput,
                null,
                null
        );

        final Component component = componentConverter.toComponent(componentMainBoard);
        assertEquals(componentMainBoard.name(), component.name);
    }

    @Test
    @DisplayName("")
    public void toComponentList_givenProcessorInput_() {
        final ProcessorInput processorInput = new ProcessorInput(
                SocketTypeEnum.LGA,
                1.7,
                4,
                8,
                120
        );
        final CreateComponentInput componentProcessor = new CreateComponentInput(
                "AMD Ryzen 5 4600G",
                ComponentTypeEnum.PROCESSOR,
                ManufacturerEnum.AMD,
                new BigDecimal("740.04"),
                10,
                processorInput,
                null,
                null,
                null
        );

        final Component component = componentConverter.toComponent(componentProcessor);
        assertEquals(componentProcessor.name(), component.name);
    }
}
