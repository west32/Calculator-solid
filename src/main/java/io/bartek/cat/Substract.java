package io.bartek.cat;

public class Substract implements MathOperation{

    public int executeOperation(String ... strings) {
        if(strings.length < 2) {
            throw new IllegalArgumentException("At least two arguments is required");
        }
        int substraction = Integer.parseInt(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            substraction -= Integer.parseInt(strings[i]);
        }
        return substraction;
    }
}
