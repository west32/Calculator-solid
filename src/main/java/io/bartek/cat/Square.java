package io.bartek.cat;

public class Square implements MathOperation{

    public int executeOperation(String... strings) {
        int input = Integer.parseInt(strings[0]);

        return input * input;
    }
}
