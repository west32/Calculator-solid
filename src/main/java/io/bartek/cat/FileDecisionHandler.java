package io.bartek.cat;

public class FileDecisionHandler {
    private final FileInputReader fileInputReader;
    private final UserInterface userInterface;

//    private String fileData;


    public FileDecisionHandler(FileInputReader fileInputReader, UserInterface userInterface) {
        this.fileInputReader = fileInputReader;
        this.userInterface = userInterface;
//        this.fileData = fileData;
    }

    public void handleDecision() {
        loadFileData();
        String[] operators = getOperatorsFromFile();
        String[] numbers = getNumbers();
        MathOperation operation = getOperationForDecision(operators[0]);
        operation.executeOperation(numbers);

    }

    public String loadFileData() {
        String fileData;
        try {
            fileData = fileInputReader.readFile();
            userInterface.printMessage("data from file: " + fileData);
        } catch (Exception e) {
            userInterface.printMessage("Reading File Error: " + e.getMessage());
            fileData = "";
        }
        return fileData;
    }

    public String[] getOperatorsFromFile() {
        String fileData = loadFileData();
        if (fileData == null || fileData.isEmpty()) {
            userInterface.printMessage("No file data available. Make sure to load file data first.");
            return new String[0];
        }

        String[] possibleOperators = {"+", "-", "*", "/", "^"};
        String[] operators = new String[fileData.length()];
        int index = 0;
        for (char charakter : fileData.toCharArray()) {
            for (String c : possibleOperators) {
                if (c.equals(String.valueOf(charakter))) {
                    index++;
                    operators[index] = c;
                }
            }
        }
        return java.util.Arrays.copyOf(operators, index);
    }



    public String[] getNumbers() {
        String fileData = loadFileData();
        return fileData.split("[+\\-*/^]");
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
