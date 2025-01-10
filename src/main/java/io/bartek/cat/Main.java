package io.bartek.cat;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        ManualDecisionHandler manualDecisionHandler = new ManualDecisionHandler(userInterface);
        PathDecisionHandler pathDecisionHandler = new PathDecisionHandler(userInterface);
        FileInputLoader fileInputReader = new FileInputLoader(userInterface);
        DecisionForOperationHandler fileDecisionHandler = new DecisionForOperationHandler(fileInputReader, userInterface);
        CalculatorStart start = new CalculatorStart(pathDecisionHandler, manualDecisionHandler, userInterface, fileInputReader, fileDecisionHandler);
        start.startCalculator();
    }
}