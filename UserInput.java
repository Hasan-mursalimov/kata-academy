package KataAcademy;

public class UserInput {

    public static String[] arrUserInputSplit(String userInput) {
        if (isDoubleString(userInput)) {
            return userInput.split(" ");
        } else {
            try {
                throw new Exception("");
            } catch (Exception e) {
                throw new RuntimeException(e.toString() + "Калькулятор умеет работать только с целыми числами");
            }
        }
    }

    private static boolean isDoubleString(String userInput) {
        boolean contains = userInput.contains(".");
        if (contains == false) {
            return true;
        }else {
            return false;
        }
    }



}
