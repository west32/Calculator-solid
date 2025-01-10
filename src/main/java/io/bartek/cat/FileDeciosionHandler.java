package io.bartek.cat;

import java.io.IOException;

public class FileDeciosionHandler {
    private final FileInputLoader fileInputLoader;
    private final FileParser fileParser;
    private final DecisionForOperationHandler decision;


    public FileDeciosionHandler(FileInputLoader fileInputLoader, FileParser fileParser, DecisionForOperationHandler decision) {
        this.fileInputLoader = fileInputLoader;
        this.fileParser = fileParser;
        this.decision = decision;
    }

    public void handleDecision() throws IOException {
        String fileData = fileInputLoader.readFile();

        if (fileData.isEmpty()) {
            System.out.println("No valid data in file.");
        }

        String[] operators = fileParser.getOperatorsFromFile(fileData);
        String[] numbers = fileParser.getNumbers(fileData);

    }
}
