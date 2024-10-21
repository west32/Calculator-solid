package io.bartek.cat;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    public void printResult(int result) {
        System.out.println("Wynik: " + result);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String getUserInput() {
        return scanner.nextLine();
    }
}
