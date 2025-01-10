package io.bartek.cat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInputLoader {
    private  UserInterface userInterface;

    public FileInputLoader(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public String readFile() throws IOException {
        try {
            userInterface.printMessage("provide file path");
            String path = userInterface.getUserInput();
            return Files.readString(Paths.get(path)).trim();
        } catch (IOException e) {
            userInterface.printMessage("File reading error: " +  e.getMessage());
            return "";
        }
    }
}
