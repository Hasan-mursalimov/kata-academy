package KataAcademy;

/**
 * класс  с методами для математическими выражениями с римскими числами
 */

public class RomanArithmetic {

    private RomanNumerals romanNumerals = new RomanNumerals();

    public String inputConversion(String userInput) {

        String[] tokens = UserInput.arrUserInputSplit(userInput);

        return switch (tokens[1]) {
            case "+" ->
                    romanNumerals.arithmeticRomanNumber(sum(romanNumerals.romanNumber(tokens[0]), romanNumerals.romanNumber(tokens[2])));
            case "-" ->
                    romanNumerals.arithmeticRomanNumber(minus(romanNumerals.romanNumber(tokens[0]), romanNumerals.romanNumber(tokens[2])));
            case "*" ->
                    romanNumerals.arithmeticRomanNumber(multiplication(romanNumerals.romanNumber(tokens[0]), romanNumerals.romanNumber(tokens[2])));
            case "/" ->
                    romanNumerals.arithmeticRomanNumber(del(romanNumerals.romanNumber(tokens[0]), romanNumerals.romanNumber(tokens[2])));
            default -> "-1";
        };
    }


    private int sum(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int del(int a, int b) {
        return a / b;
    }

    private int multiplication(int a, int b) {
        return a * b;
    }

}
