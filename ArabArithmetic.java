package KataAcademy;

public class ArabArithmetic {


    public int inputConversion(String userInput) {


        String[] tokens = UserInput.arrUserInputSplit(userInput);

        int oneNum = Integer.parseInt(tokens[0]);
        int twoNum = Integer.parseInt(tokens[2]);
        if (tokens[1].equals("+")) {
            return sum(oneNum, twoNum);
        } else if (tokens[1].equals("-")) {
            return minus(oneNum, twoNum);
        } else if (tokens[1].equals("*")) {
            return multiplication(oneNum, twoNum);
        } else if (tokens[1].equals("/")) {
            return del(oneNum, twoNum);
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int sum(int a, int b) {
        if (isValidNum(a, b)) {
            return a + b;
        }else {
            return 0;
        }
    }

    public int minus(int a, int b) {
        if (isValidNum(a, b)) {
            return a - b;
        }else {
            return 0;
        }
    }

    public int del(int a, int b) {
        if (isValidNum(a, b)) {
            return a / b;
        }else {
            return 0;
        }
    }

    public int multiplication(int a, int b) {
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
                throw new RuntimeException(e.toString() + "Введенное число должно быть больше 0 и мнеьше 11");
            }
        }
    }
}
