package KataAcademy;


import java.util.Scanner;

public class InputValidation {

    private ArabArithmetic arabArithmetic;
    private RomanArithmetic romanArithmetic;

    private String[] romanNumber;

    private String[] arabNumber;

    private String[] mathematicalExpressions;


    private String[] arrUserInput;

    public void methodSelection(String userInput) {

        romanArithmetic = new RomanArithmetic();
        arabArithmetic = new ArabArithmetic();
        if (isCountMathematicalExpressions(userInput)) {
            if (isRomanNumber(userInput)) {
                System.out.println(romanArithmetic.inputConversion(userInput));
            } else if (isArabNumber(userInput)) {
                System.out.println(arabArithmetic.inputConversion(userInput));
            } else {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new RuntimeException(e.toString() + "т.к. используются одновременно разные системы счисления");
                }
            }
        }
    }

    private boolean isRomanNumber(String userInput) {
        arrUserInput = UserInput.arrUserInputSplit(userInput);

        romanNumber = new String[10];

        for (int i = 0; i < romanNumber.length; i++) {
            romanNumber[i] = new String();
        }
        romanNumber[0] = "I";
        romanNumber[1] = "II";
        romanNumber[2] = "III";
        romanNumber[3] = "IV";
        romanNumber[4] = "V";
        romanNumber[5] = "VI";
        romanNumber[6] = "VII";
        romanNumber[7] = "VIII";
        romanNumber[8] = "IX";
        romanNumber[9] = "X";

        for (String r : romanNumber) {
            if (r.equals(arrUserInput[0]) || r.equals(arrUserInput[2])) {
                return true;
            }
        }
        return false;
    }

    private boolean isArabNumber(String userInput) {
        arrUserInput = UserInput.arrUserInputSplit(userInput);

        arabNumber = new String[10];

        for (int i = 0; i < arabNumber.length; i++) {
            arabNumber[i] = new String();
        }
        arabNumber[0] = "1";
        arabNumber[1] = "2";
        arabNumber[2] = "3";
        arabNumber[3] = "4";
        arabNumber[4] = "5";
        arabNumber[5] = "6";
        arabNumber[6] = "7";
        arabNumber[7] = "8";
        arabNumber[8] = "9";
        arabNumber[9] = "10";

        for (String r : arabNumber) {
            if (r.equals(arrUserInput[0]) || r.equals(arrUserInput[2])) {
                return true;
            }
        }
        return false;
    }

    private boolean isCountMathematicalExpressions(String userInput) {
        int count = countMathematicalExpressions(userInput);
        if (count == 1) {
            return true;
        } else if (count == 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e.toString() + "т.к. строка не является математической операцией");
            }
        } else if (count > 1) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e.toString() + "т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        }
        return false;
    }

    private int countMathematicalExpressions(String userInput) {
        mathematicalExpressions = new String[4];
        int count = 0;
        arrUserInput = userInput.split(" ");
        for (int i = 0; i < mathematicalExpressions.length; i++) {
            mathematicalExpressions[i] = new String();
        }
        mathematicalExpressions[0] = "+";
        mathematicalExpressions[1] = "-";
        mathematicalExpressions[2] = "*";
        mathematicalExpressions[3] = "/";

        for (String m : mathematicalExpressions) {
            for (int i = 0; i < arrUserInput.length; i++) {
                if (m.equals(arrUserInput[i])) {
                    count++;
                }
            }
        }
        return count;
    }

}
