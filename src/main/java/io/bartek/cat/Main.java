package io.bartek.cat;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        ManualDecisionHandler manualDecisionHandler = new ManualDecisionHandler(userInterface);
        CalculatorStart start = new CalculatorStart(manualDecisionHandler, userInterface);
        start.startCalculator();
    }
}