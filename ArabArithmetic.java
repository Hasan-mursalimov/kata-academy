package KataAcademy;

/**
 * класс с методами для математическими выражениями с арабскими числами
 */
public class ArabArithmetic {


    public int inputConversion(String userInput) {

        String[] tokens = UserInput.arrUserInputSplit(userInput);

        int oneNum = Integer.parseInt(tokens[0]);
        int twoNum = Integer.parseInt(tokens[2]);
        switch (tokens[1]) {
            case "+" -> {
                return sum(oneNum, twoNum);
            }
            case "-" -> {
                return minus(oneNum, twoNum);
            }
            case "*" -> {
                return multiplication(oneNum, twoNum);
            }
            case "/" -> {
                return del(oneNum, twoNum);
            }
            default -> {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private int sum(int a, int b) {
        if (isValidNum(a, b)) {
            return a + b;
        }else {
            return 0;
        }
    }

    private int minus(int a, int b) {
        if (isValidNum(a, b)) {
            return a - b;
        }else {
            return 0;
        }
    }

    private int del(int a, int b) {
        if (isValidNum(a, b)) {
            return a / b;
        }else {
            return 0;
        }
    }

    private int multiplication(int a, int b) {
        if (isValidNum(a, b)) {
            return a * b;
        }else {
            return 0;
        }
    }

    private boolean isValidNum(int a, int b){
        if ((a > 0 && a <=10) && (b > 0 && b <= 10) ){
            return true;
        }else {
            try {
                throw new Exception("");
            } catch (Exception e) {
                throw new RuntimeException(e.toString() + "Введенное число должно быть больше 10 и меньше 10");
            }
        }
    }
}
