package com.css.core.component.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComponentTest {

//    @Test
//    @DisplayName("Given 1000 Main Boards at an unit cost of 1250.99 should return 1250990.00")
//    public void calculateTotalValue_given1000MainBoardsAt() {
//
//        final Component component = new Component(
//                "PRIME Z690-A",
//                new BigDecimal("1250.99"),
//                1000,
//                ComponentTypeEnum.MAIN_BOARD,
//                SocketTypeEnum.LGA
//        );
//
//        // when
//        final BigDecimal totalValue = component.calculateTotalValue();
//
//        // then
//        assertEquals(new BigDecimal("1250990.00"), totalValue);
//        assertEquals(1, component.getId());
//        assertEquals("PRIME Z690-A", component.getName());
//        assertEquals(1000, component.getQuantity());
//        assertEquals(new BigDecimal("1250.99"), component.getPrice());
//        assertEquals(ComponentTypeEnum.MAIN_BOARD, component.getType());
//        assertEquals(SocketTypeEnum.LGA, component.getSocket());
//    }
//
//    @Test
//    @DisplayName("Given a component with zero quantity should calculate zero total value")
//    public void calculateTotalValue_given0_shouldCalculateZero() {
//
//        // given
//        final Component component = new Component(
//                "PRIME Z690-A",
//                new BigDecimal("1250.99"),
//                0,
//                ComponentTypeEnum.MAIN_BOARD,
//                SocketTypeEnum.LGA
//        );
//
//        // when
//        final BigDecimal totalValue = component.calculateTotalValue();
//
//        // then
//        assertEquals(new BigDecimal("0.00"), totalValue);
//    }
}