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
            String[] numbers;
            int result;

            if (decision.equals("s")) {
                String number = askForSingleNumber();
                result = operation.executeOperation(number);
            } else {
                numbers = askForNumbers();
                result = operation.executeOperation(numbers);
            }
            userInterface.printResult(result);
        } else if (!decision.equals("x")) {
            userInterface.printMessage("Wrong operation, try again");
        }
    }
    private String[] askForNumbers() {
        String[] numbers = {};
        boolean validInput = false;

        while(!validInput) {
            userInterface.printMessage("type numbers for operation, separated by single space");
            String input = userInterface.getUserInput();
            input = input.replaceAll("\\s+", " ");

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

    private String askForSingleNumber() {
        boolean validInput = false;
        String input = "";
        while(!validInput) {
            userInterface.printMessage("type exactly single number:");
            input = userInterface.getUserInput().trim();

            if(input.matches("-?\\d+")) {
                validInput = true;
            }else{
                userInterface.printMessage("invalid input, type single integer value");
            }
        }
        return input;
    }

    private MathOperation getOperationForDecision(String decision) {
        return switch(decision) {
            case "+" -> new Sum();
            case "-" -> new Substract();
            case "s" -> new Square();
            default -> null;
        };
    }
}
