package io.bartek.cat;

import java.util.Objects;

public class PathDecisionHandler {
    private UserInterface userInterface;

    public PathDecisionHandler(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public String getPathDecision() {
        while (true) {
            userInterface.printMessage("Type 'manual' if you want to input data manually or 'file' if you want to load it from file, 'x' to finish");
            String decision = userInterface.getUserInput();
            if (decision.equals("manual") || decision.equals("file") || decision.equals("x")) {
                return decision;
            }
            userInterface.printMessage("Invalid input. Please type 'manual', 'file', or 'x'.");

        }
    }
}
