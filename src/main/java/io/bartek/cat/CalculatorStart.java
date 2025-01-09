package io.bartek.cat;

import java.io.IOException;

public class CalculatorStart {
    private PathDecisionHandler pathDecisionHandler;
    private final ManualDecisionHandler manualDecisionHandler;
    private UserInterface userInterface;
    private final FileInputReader fileInputReader;

    private  final FileDecisionHandler fileDecisionHandler;

    public CalculatorStart(PathDecisionHandler pathDecisionHandler, ManualDecisionHandler calculatorDecisionHandler, UserInterface userInterface, FileInputReader fileInputReader, FileDecisionHandler fileDecisionHandler) {
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
