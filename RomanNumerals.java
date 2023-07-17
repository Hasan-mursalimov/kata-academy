package KataAcademy;

/**
 * Класс для переобразования String в int и обратно
 */

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

        String[] romansNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int[] arabNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int element = 0;
        if (num <= 10) {
            return romansNumbers[findIndex(arabNumber, num)];
        }
        if (num > 10 && num <= 20) {
            element = returnOfTheRemainder(num);
            return "X" + romansNumbers[element];
        }
        if (num > 20 && num <= 30) {
            element = returnOfTheRemainder(num);
            return "XX" + romansNumbers[element];
        }
        if (num > 30 && num < 40) {
            element = returnOfTheRemainder(num);
            return "XXX" + romansNumbers[element];
        }
        if (num == 40) {
            return "XXL";
        } else if (num > 40 && num < 50) {
            element = returnOfTheRemainder(num);
            return "XL" + romansNumbers[element];
        }
        if (num == 50) {
            return "L";
        } else if (num > 50 && num < 60) {
            element = returnOfTheRemainder(num);
            return "L" + romansNumbers[element];
        }
        if (num == 60) {
            return "LX";
        } else if (num > 60 && num < 70) {
            element = returnOfTheRemainder(num);
            return "LX" + romansNumbers[element];
        }
        if (num == 70) {
            return "LXX";
        } else if (num > 70 && num < 80) {
            element = returnOfTheRemainder(num);
            return "LXX" + romansNumbers[element];
        }
        if (num == 80) {
            return "LXXX";
        } else if (num > 80 && num < 90) {
            element = returnOfTheRemainder(num);
            return "LXXX" + romansNumbers[element];
        }
        if (num == 90) {
            return "XC";
        } else if (num > 90 && num < 100) {
            element = returnOfTheRemainder(num);
            return "XC" + romansNumbers[element];
        }
        if (num==100) {
            return "C";
        }
        return "Не найдено чисел";
    }

    public int findIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int returnOfTheRemainder(int num) {
        return num % 10 - 1;
    }


}
