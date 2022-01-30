package com.company.calculator;

public class Calculation {

    public double calculationOfExpression(String text, double[] numbers) {
        double result = 0;
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == '+') {
                result = numbers[0] + numbers[1];
                break;
            } else if (text.charAt(i) == '-') {
                result = numbers[0] - numbers[1];
                break;
            } else if (text.charAt(i) == '*') {
                result = numbers[0] * numbers[1];
                break;
            } else if (text.charAt(i) == '/') {
                try {
                    if (numbers[1] == 0) {
                        throw new ArithmeticException("Division by zero is forbidden");
                    }
                } catch (ArithmeticException e) {
                    System.out.println(e);
                    System.exit(0);
                }
                result = numbers[0] / numbers[1];
                break;
            }
        }
        return result;
    }
}