package io.bartek.cat;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        CalculatorDecisionHandler calculatorDecisionHandler = new CalculatorDecisionHandler(userInterface);
        CalculatorStart start = new CalculatorStart(calculatorDecisionHandler, userInterface);
        start.startCalculator();
    }
}