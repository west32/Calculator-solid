package io.bartek.cat;

public class Sum implements MathOperation{

    public int executeOperation(String... strings) {
        if(strings.length < 2) {
            throw new IllegalArgumentException("At least two arguments is required");
        }
        int sum = 0;
        for (String stringNumber : strings) {
            sum += Integer.parseInt(stringNumber);
        }
        return sum;
    }
}
