package io.bartek.cat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void shouldReturnCorrectResultOfSumming() {
        //given
        String[] listOfStrings = {"3", "1", "1"};

        //when
        Sum sum = new Sum();
        int sumResult = sum.executeOperation(listOfStrings);

        //then
        assertEquals(5, sumResult);
    }

    @Test
    void shouldThrowExceptionWhenNoArgumentsGiven() {
        //given
        Sum sum = new Sum();
        String[] emptyListOfStrings = {};

        //when
        var exception = assertThrows(IllegalArgumentException.class, sum::executeOperation);

        //then
        assertEquals("At least two arguments is required", exception.getMessage());
    }

    @Test
    void shouldReturnCorrectResult_whenNegativeNumbersGiven() {
        //given
        Sum sum = new Sum();
        String[] negativeNumbers = {"-3","-10"};

        //when
        int result = sum.executeOperation(negativeNumbers);

        //then
        assertEquals(-13, result);
    }
}