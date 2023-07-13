package KataAcademy;

public class RomanArithmetic {

    RomanNumerals romanNumerals = new RomanNumerals();

    public String inputConversion(String userInput) {

        String[] tokens = UserInput.arrUserInputSplit(userInput);

        if (tokens[1].equals("+")) {
            return romanNumerals.arithmeticRomanNumber(sum(romanNumerals.romanNumber(tokens[0]), romanNumerals.romanNumber(tokens[2])));
        } else if (tokens[1].equals("-")) {
            return romanNumerals.arithmeticRomanNumber(minus(romanNumerals.romanNumber(tokens[0]), romanNumerals.romanNumber(tokens[2])));
        } else if (tokens[1].equals("*")) {
            return romanNumerals.arithmeticRomanNumber(multiplication(romanNumerals.romanNumber(tokens[0]), romanNumerals.romanNumber(tokens[2])));
        } else if (tokens[1].equals("/")) {
            return romanNumerals.arithmeticRomanNumber(del(romanNumerals.romanNumber(tokens[0]), romanNumerals.romanNumber(tokens[2])));
        } else {
            return "-1";
        }
    }


    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int del(int a, int b) {
        return a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    private boolean isPositiveNumber(int a, int b) {
        if (minus(a, b) > 0) {
            return true;
        } else {
            return false;
        }
    }

}
