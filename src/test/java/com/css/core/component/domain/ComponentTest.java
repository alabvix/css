package com.css.core.component.domain;

import com.css.core.component.domain.hardware.MainBoard;
import com.css.core.component.domain.hardware.SocketTypeEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComponentTest {

    @Test
    @DisplayName("CalcTotalValue: Given 1000 Main Boards at an unit cost of 1250.99 should return 1250990.00")
    public void calculateTotalValue_given1000MainBoardsAt() {

        final Component component = new Component(
                "PRIME Z690-A",
                ComponentTypeEnum.MAIN_BOARD,
                new BigDecimal("1250.99"),
                ManufacturerEnum.ASUS,
                1000,
                new MainBoard(
                        SocketTypeEnum.LGA,
                        true,
                        false,
                        6,
                        10
                )
        );

        // when
        final BigDecimal totalValue = component.calcTotalValue();

        // then
        assertEquals(new BigDecimal("1250990.00"), totalValue);
    }

}