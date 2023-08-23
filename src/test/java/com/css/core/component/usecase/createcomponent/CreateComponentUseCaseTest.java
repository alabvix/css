package com.css.core.component.usecase.createcomponent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateComponentUseCaseTest {

    @InjectMocks
    private CreateComponentUseCase createComponentUseCase;

    @Test
    @DisplayName("Create: given valid components should return status create and no error message.")
    public void create_givenValidComponents_() {
        assertEquals(true, false);
    }

    @Test
    @DisplayName("Create: given two components with same name should return status fail and error message.")
    public void create_givenSameName_() {
        assertEquals(true, false);
    }

    @Test
    @DisplayName("Create: given components with zero, negative or null price should return status fail and error message.")
    public void create_givenInvalidPrice_() {
        assertEquals(true, false);
    }

    @Test
    @DisplayName("Create: given components with zero, negative or null quantity should return status fail and error message.")
    public void create_givenInvalidQuantity_() {
        assertEquals(true, false);
    }

    @Test
    @DisplayName("Create: given component without type should return status fail and error message.")
    public void create_givenNoType_() {
        assertEquals(true, false);
    }

    @Test
    @DisplayName("Create: given component without socket should return status fail and error message.")
    public void create_givenNoSocket_() {
        assertEquals(true, false);
    }

}
