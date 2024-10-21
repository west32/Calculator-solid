package io.bartek.cat;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubstractTest {

    @Test
    void shouldReturnCorrectResultOfSubstraction_whenThreeNumbersAreGiven() {
        //given
        Substract substract = new Substract();
        String[] listOfStrings = {"3", "1","1"};

        //when
        int substractionResult = substract.executeOperation(listOfStrings);

        //then
        assertEquals(1, substractionResult);
    }

    @Test
    void shouldThrowExceptionWhenNoArgumentsGiven() {
        //given
        Substract substract = new Substract();
        String[] emptyListOfStrings = {};

        //when
        var exception = assertThrows(IllegalArgumentException.class, substract::executeOperation);

        //then
        assertEquals("At least two arguments is required", exception.getMessage());
    }

    @Test
    void shouldReturnCorrectResult_whenNegativeNumbersGiven() {
        //given
        Substract substract = new Substract();
        String[] negativeNumbers = {"-1","-10"};

        //when
        int result = substract.executeOperation(negativeNumbers);

        //then
        assertEquals(9, result);
    }

}