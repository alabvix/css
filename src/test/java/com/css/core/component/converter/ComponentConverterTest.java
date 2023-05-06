package com.css.core.component.converter;

import com.css.core.component.entity.Component;
import com.css.core.component.entity.ComponentType;
import com.css.core.component.entity.SocketType;
import com.css.core.component.usecase.createcomponent.CreateComponentInput;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComponentConverterTest {

    private final ComponentConverter componentConverter = new ComponentConverter();

    @Test
    public void toComponentList() {
        // given
        final CreateComponentInput mainBoard= new CreateComponentInput(
                "Asus Prime B450M",
                ComponentType.MAIN_BOARD,
                new BigDecimal("560.33"),
                SocketType.LGA);

        final CreateComponentInput ssd= new CreateComponentInput(
                "Kingston A400 Bulk ",
                ComponentType.SSD,
                new BigDecimal("172.99"));

        List<CreateComponentInput> inputList = new ArrayList<>();
        Collections.addAll(inputList, mainBoard, ssd);

        // when
        List<Component> components = componentConverter.toComponentList(inputList);

        // then
        assertEquals(mainBoard.name, components.get(0).getName());

    }
}
