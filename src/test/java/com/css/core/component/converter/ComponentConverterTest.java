package com.css.core.component.converter;

import com.css.core.component.domain.Component;
import com.css.core.component.domain.ComponentTypeEnum;
import com.css.core.component.domain.ManufacturerEnum;
import com.css.core.component.domain.hardware.SocketTypeEnum;
import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;
import com.css.core.component.usecase.createcomponent.input.MainBoardInput;
import com.css.core.component.usecase.createcomponent.input.PowerSupplyInput;
import com.css.core.component.usecase.createcomponent.input.ProcessorInput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComponentConverterTest {

    private final ComponentConverter componentConverter = new ComponentConverter();

    @Test
    @DisplayName("ToComponent: given null input should throws a NullPointerException")
    public void toComponent_givenNullInput_shouldThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            componentConverter.toComponent(null);
        });
    }

    @Test
    @DisplayName("ToComponent: given null hardware should throws a NullPointerException")
    public void toComponent_givenNullHardware_() {
        assertThrows(NullPointerException.class, () -> {
            componentConverter.toComponent(null);
        });
    }

    @Test
    @DisplayName("")
    public void toComponent_givenMainBoardInput_() {
        final MainBoardInput hardwareInput = new MainBoardInput(
                SocketTypeEnum.LGA,
                false,
                true,
                4,
                120
        );
        final CreateComponentInput componentInput = new CreateComponentInput(
                "Asus Prime B450M",
                ComponentTypeEnum.MAIN_BOARD,
                ManufacturerEnum.ASUS,
                new BigDecimal("560.33"),
                10,
                null,
                hardwareInput,
                null,
                null
        );

        final Component component = componentConverter.toComponent(componentInput);

        assertEquals(componentInput.name(), component.name);
        assertEquals(componentInput.manufacturer(), component.manufacturer);
        assertEquals(componentInput.type(), component.type);
        assertEquals(componentInput.price(), component.price);
        assertEquals(componentInput.quantity(), component.quantity);
    }

    @Test
    @DisplayName("")
    public void toComponentList_givenProcessorInput_() {
        final ProcessorInput hardwareInput = new ProcessorInput(
                SocketTypeEnum.LGA,
                1.7,
                4,
                8,
                120
        );
        final CreateComponentInput componentInput = new CreateComponentInput(
                "AMD Ryzen 5 4600G",
                ComponentTypeEnum.PROCESSOR,
                ManufacturerEnum.AMD,
                new BigDecimal("740.04"),
                10,
                hardwareInput,
                null,
                null,
                null
        );

        final Component component = componentConverter.toComponent(componentInput);

        assertEquals(componentInput.name(), component.name);
    }

    @Test
    @DisplayName("")
    public void toComponentList_givenPowerSupplyInput_() {
        final PowerSupplyInput powerSupplyInput = new PowerSupplyInput(
                false,
                100,
                "3.3V-18A, 5V-18A, +12V-54A, -12V-0.5A, +5VSB-2.5A",
                750
        );
        final CreateComponentInput componentProcessor = new CreateComponentInput(
                "Gamemax GP750",
                ComponentTypeEnum.POWER_SUPPLY,
                ManufacturerEnum.GameMax,
                new BigDecimal("373.00"),
                15,
                null,
                null,
                powerSupplyInput,
                null
        );

        final Component component = componentConverter.toComponent(componentProcessor);
        assertEquals(componentProcessor.name(), component.name);
    }
}