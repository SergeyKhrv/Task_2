package com.company.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter expression for calculation");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        TextValidation textValidation = new TextValidation(text);
        Numbers numbers = new Numbers();
        Calculation calculation = new Calculation();
        System.out.println(calculation.calculationOfExpression(textValidation.isTextCorrect(text),
                numbers.getNumbers(textValidation.isTextCorrect(text))));
    }
}