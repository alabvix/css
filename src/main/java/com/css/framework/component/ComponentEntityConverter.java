package com.css.framework.component;

import com.css.core.component.domain.Component;
import com.css.framework.component.entity.*;

@org.springframework.stereotype.Component
public class ComponentEntityConverter {

    public ComponentEntity toEntity(Component component) {
        final ComponentEntity componentEntity = new ComponentEntity();
        componentEntity.setName(component.name);
        componentEntity.setManufacturer(component.manufacturer);
        componentEntity.setPrice(component.price);
        componentEntity.setType(component.type);
        componentEntity.setQuantity(component.quantity);

        switch (component.type) {
            case MAIN_BOARD -> {
                final MainBoardEntity entity = new MainBoardEntity(
                        component.getMainBoard().socket(),
                        component.getMainBoard().ecc(),
                        component.getMainBoard().raid(),
                        component.getMainBoard().memorySlots(),
                        component.getMainBoard().energyConsumption(),
                        componentEntity
                );
                componentEntity.setMainBoard(entity);
            }
            case PROCESSOR -> {
                final ProcessorEntity entity = new ProcessorEntity(
                        component.getProcessor().socket(),
                        component.getProcessor().clock(),
                        component.getProcessor().threads(),
                        component.getProcessor().cores(),
                        component.getProcessor().energyConsumption(),
                        componentEntity
                );
                componentEntity.setProcessor(entity);
            }
            case POWER_SUPPLY -> {
                final PowerSupplyEntity entity = new PowerSupplyEntity(
                        component.getPowerSupply().fanLess(),
                        component.getPowerSupply().efficiency(),
                        component.getPowerSupply().output(),
                        component.getPowerSupply().power(),
                        componentEntity
                );
                componentEntity.setPowerSupply(entity);
            }
            case GRAPHIC_CARD -> {
                final GraphicCardEntity entity = new GraphicCardEntity(
                        component.getGraphicCard().totalMemory(),
                        component.getGraphicCard().multiGpu(),
                        component.getGraphicCard().rayTracing(),
                        component.getGraphicCard().energyConsumption(),
                        componentEntity
                );
                componentEntity.setGraphicCard(entity);
            }
        }
        return  componentEntity;
    }
}

