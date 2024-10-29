package io.bartek.cat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SquareTest {

    @Test
    void shouldReturnCorrectResult_whenSingleIntegerGivenAsAString() {
        //given
        String input = "2";

        //when
        Square square = new Square();
        int result = square.executeOperation(input);

        //then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnCorrectResult_whenNegativeNumberIsGiven() {
        //given
        String input = "-3";

        //when
        Square square = new Square();
        int result = square.executeOperation(input);

        //then
        assertEquals(9, result);
    }

    @Test
    void shouldReturnZero_whenZeroisGiven() {
        //given
        String input = "0";

        //when
        Square square = new Square();
        int result = square.executeOperation(input);

        //then
        assertEquals(0, result);
    }

    @Test
    void shouldSendInformationAndLetTryAgain_whenNotIntegerGiven() {
        //given
        String input = "abc";
        UserInterface userInterface = mock(UserInterface.class);

        //when
        Square square = new Square();
        int result = square.executeOperation(input);

        //then
        verify(userInterface).printMessage("Invalid input, type single integer value");
    }

}