package io.bartek.cat;public class CalculatorStart {
    private final PathDecisionHandler pathDecisionHandler
    private final ManualDecisionHandler manualDecisionHandler;
    private final UserInterface userInterface;

    public CalculatorStart(ManualDecisionHandler calculatorDecisionHandler, UserInterface userInterface) {
        this.manualDecisionHandler = calculatorDecisionHandler;
        this.userInterface = userInterface;
    }
    public void startCalculator() {
        String decision = "";

        String operatorDecision = manualDecisionHandler.getOperatorDecision();

        while (!decision.equals("x")) {
            String pathDecision = pathDecisionHandler.getPathDecision();
            decision = pathDecision;
            if(pathDecision.equals("file"))
                FileDecisionHandler.handleDecision();
            }
        }
        userInterface.printMessage("calculator has stopped working");
    }

}
