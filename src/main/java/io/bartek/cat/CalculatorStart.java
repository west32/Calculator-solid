package io.bartek.cat;public class CalculatorStart {
    private final CalculatorDecisionHandler calculatorDecisionHandler;
    private final UserInterface userInterface;

    public CalculatorStart(CalculatorDecisionHandler calculatorDecisionHandler, UserInterface userInterface) {
        this.calculatorDecisionHandler = calculatorDecisionHandler;
        this.userInterface = userInterface;
    }
    public void startCalculator() {
        String decision = "";
        while (!decision.equals("x")) {
            userInterface.printMessage("choose '+' to sum, '-' to substract, 'x' to abort");
            decision = userInterface.getUserInput();

            if(!decision.equals("x")) {
                calculatorDecisionHandler.handeDecision(decision);
            }
        }
        userInterface.printMessage("calculator has stopped working");
    }

}
