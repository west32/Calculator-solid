package io.bartek.cat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorStartTest {

    private CalculatorStart calculatorStart;
    private CalculatorDecisionHandler decisionHandler;
    private UserInterface userInterface;


   @Test
   void shouldContinueUntilExit() {
       //given
       String decision = "+";

       //when
       calculatorStart.startCalculator();
   }

}