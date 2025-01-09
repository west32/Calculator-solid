package io.bartek.cat;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserInterface userInterface = new UserInterface();
        ManualDecisionHandler manualDecisionHandler = new ManualDecisionHandler(userInterface);
        PathDecisionHandler pathDecisionHandler = new PathDecisionHandler(userInterface);
        FileInputReader fileInputReader = new FileInputReader();
        FileDecisionHandler fileDecisionHandler = new FileDecisionHandler(fileInputReader, userInterface);
        CalculatorStart start = new CalculatorStart(pathDecisionHandler, manualDecisionHandler, userInterface, fileInputReader, fileDecisionHandler);
        start.startCalculator();
    }
}