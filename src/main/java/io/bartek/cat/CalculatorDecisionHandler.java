package io.bartek.cat;

import java.util.Scanner;

public class CalculatorDecisionHandler {

    private final UserInterface userInterface;

    public CalculatorDecisionHandler(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public void handeDecision(String decision) {
            MathOperation operation = getOperationForDecision(decision);
            if (operation != null) {
                String[] numbers = askForNumbers();
                int result = operation.executeOperation(numbers);
                userInterface.printResult(result);
            } else if (!decision.equals("x")) {
                userInterface.printMessage("wrong operation, try again");
            }
        }
    private String[] askForNumbers() {
        String[] numbers = {};
        boolean validInput = false;

        while(!validInput) {
            userInterface.printMessage("type numbers for operation, separated by space");
            String input = userInterface.getUserInput();
            numbers = input.split(" ");

            if (numbers.length < 2) {
                userInterface.printMessage("At least two arguments is required");
                continue;
            }
            boolean allNumbersValid = true;
            for(String number : numbers) {
                try {
                    Integer.parseInt(number);
                }catch (NumberFormatException e) {
                    allNumbersValid = false;
                    break;
                }
            }
            if(!allNumbersValid) {
                userInterface.printMessage("Please enter valid integers only");
            }else validInput = true;
        }

        return numbers;
    }

    private MathOperation getOperationForDecision(String decision) {
        return switch(decision) {
            case "+" -> new Sum();
            case "-" -> new Substract();
            default -> null;
        };
    }
}


//    private String[] askForNumbers() {
//        String[] numbers = {};
//        boolean validInput = false;
//        while(!validInput) {
//            userInterface.printMessage("type numbers for operation, separated by space");
//            String input = userInterface.getUserInput();
//            numbers = input.split(" ");
//            if (numbers.length < 2) {
//                userInterface.printMessage("At least two arguments is required");
//            } else validInput = true;
//        }
//        return numbers;