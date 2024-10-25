package io.bartek.cat;

public class Sum implements MathOperation{

    public int executeOperation(String... strings) {

        int sum = 0;
        for (String stringNumber : strings) {
            sum += Integer.parseInt(stringNumber);
        }
        return sum;
    }
}
