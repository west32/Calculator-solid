package io.bartek.cat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInputReader {
    private  UserInterface userInterface;
    public String readFile() throws IOException {
        userInterface.printMessage("provide file path");
        String path = userInterface.getUserInput();
        return Files.readString(Paths.get(path)).trim();
    }
}
