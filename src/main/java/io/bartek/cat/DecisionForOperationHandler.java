package io.bartek.cat;

public class DecisionForOperationHandler {
    private final UserInterface userInterface;



    public DecisionForOperationHandler(FileInputLoader fileInputReader, UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    private MathOperation getOperationForDecision(String decision) {
        return switch (decision) {
            case "+" -> new Sum();
            case "-" -> new Substract();
            case "s" -> new Square();
            default -> null;
        };
    }
}
