package KataAcademy;

public class RomanNumerals {

    public int romanNumber(String number) {
        Integer num;
        if (number.equals("I")) {
            return num = 1;
        } else if (number.equals("II")) {
            return num = 2;
        } else if (number.equals("III")) {
            return num = 3;
        } else if (number.equals("IV")) {
            return num = 4;
        } else if (number.equals("V")) {
            return num = 5;
        } else if (number.equals("VI")) {
            return num = 6;
        } else if (number.equals("VII")) {
            return num = 7;
        } else if (number.equals("VIII")) {
            return num = 8;
        } else if (number.equals("IX")) {
            return num = 9;
        } else if (number.equals("X")) {
            return num = 10;
        } else {
            try {
                throw new Exception("");
            } catch (Exception e) {
                throw new RuntimeException(e.toString() + "такое число не предусмотренно");
            }
        }
    }

    public String arithmeticRomanNumber(int num) {
        if (num == 1) {
            return "I";
        } else if (num == 2) {
            return "II";
        } else if (num == 3) {
            return "III";
        } else if (num == 4) {
            return "IV";
        } else if (num == 5) {
            return "V";
        } else if (num == 6) {
            return "VI";
        } else if (num == 7) {
            return "VII";
        } else if (num == 8) {
            return "VIII";
        } else if (num == 9) {
            return "IX";
        } else if (num == 10) {
            return "X";
        } else if (num > 10) {
            return "X...";
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e.toString() + "т.к. в римской системе нет отрицательных чисел и нуля");
            }
        }
    }
}
