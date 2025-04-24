package io.bartek.cat;

public class FileParser {
    private static final String[] possibleOperators = {"+", "-", "*", "/", "^"};

    public String[] getOperatorsFromFile(String fileData) {
        String[] operators = new String[fileData.length()];
        int index = 0;
        for (char ch : fileData.toCharArray()) {
            for (String element: possibleOperators) {
                if (element.equals(String.valueOf(ch))) {
                    index ++;
                    operators[index] = element;
                }
            }
        }return operators;
    }

    public String[] getNumbers (String fileData) {
        return fileData.split("[+\\-*/^]");
    }

}
