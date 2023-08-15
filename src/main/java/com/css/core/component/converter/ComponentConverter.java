package com.css.core.component.converter;

import com.css.core.component.domain.Component;
import com.css.core.component.domain.hardware.*;
import com.css.core.component.usecase.createcomponent.input.CreateComponentInput;

public class ComponentConverter {
    public Component toComponent(CreateComponentInput input) {
        return new Component(
                input.name(),
                input.type(),
                input.price(),
                input.manufacturer(),
                input.quantity(),
                getHardware(input)
        );
    }

    private Hardware getHardware(CreateComponentInput input) {
        Hardware hardware = null;

        switch (input.type()) {
            case MAIN_BOARD -> hardware = new MainBoard(
                    input.mainBoard().socket(),
                    input.mainBoard().ecc(),
                    input.mainBoard().raid(),
                    input.mainBoard().memorySlots(),
                    input.mainBoard().energyConsumption()
            );
            case PROCESSOR -> hardware = new Processor(
                    input.processor().socket(),
                    input.processor().clock(),
                    input.processor().threads(),
                    input.processor().cores(),
                    input.processor().energyConsumption()
            );
            case POWER_SUPPLY -> hardware = new PowerSupply(
                    input.powerSupply().fanLess(),
                    input.powerSupply().efficiency(),
                    input.powerSupply().output(),
                    input.powerSupply().power()
            );
            case GRAPHIC_CARD -> hardware = new GraphicCard(
                    input.graphicCard().totalMemory(),
                    input.graphicCard().multiGpu(),
                    input.graphicCard().rayTracing(),
                    input.graphicCard().energyConsumption()
            );
        }
        return hardware;
    }
}