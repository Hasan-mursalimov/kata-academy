package KataAcademy;

import java.util.Scanner;

public class Calculator {

    private static Scanner scanner;

    private static String[] arabNumber = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    private static String[] arrUserInput;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        InputValidation inputValidation = new InputValidation();
        inputValidation.methodSelection(input.toUpperCase());

    }


}

