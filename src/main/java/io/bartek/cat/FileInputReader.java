package io.bartek.cat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInputReader {
    private final UserInterface userInterface;
    public String readFile(String path) throws IOException {
        userInterface.printMessage("provide file path");
        return Files.readString(Paths.get(path)).trim();
    }
}
