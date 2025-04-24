package io.bartek.cat;

public class CalculatorStart {
    private PathDecisionHandler pathDecisionHandler;
    private final ManualDecisionHandler manualDecisionHandler;
    private UserInterface userInterface;
    private final FileInputLoader fileInputReader;

    private  final DecisionForOperationHandler fileDecisionHandler;

    public CalculatorStart(PathDecisionHandler pathDecisionHandler, ManualDecisionHandler calculatorDecisionHandler, UserInterface userInterface, FileInputLoader fileInputReader, DecisionForOperationHandler fileDecisionHandler) {
        this.pathDecisionHandler = pathDecisionHandler;
        this.manualDecisionHandler = calculatorDecisionHandler;
        this.userInterface = userInterface;
        this.fileInputReader = fileInputReader;
        this.fileDecisionHandler = fileDecisionHandler;
    }

    public void startCalculator()  {
        String decision = "";
        while (!decision.equals("x")) {
            String pathDecision = pathDecisionHandler.getPathDecision();
            decision = pathDecision;
            if (pathDecision.equals("file")){
                fileDecisionHandler.handleDecision();
            }else if (pathDecision.equals("manual")) {
                decision = manualDecisionHandler.getOperatorDecision();
                manualDecisionHandler.handeDecision(decision);

            }
        }
        userInterface.printMessage("calculator has stopped working");
    }

}
