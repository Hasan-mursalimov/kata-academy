package KataAcademy;

import java.util.Scanner;

public class Calculator {

    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        InputValidation inputValidation = new InputValidation();
        inputValidation.methodSelection(input.toUpperCase());

    }


}

