package com.company.calculator;

import org.apache.commons.lang.NullArgumentException;

public class Numbers {
    private double number1;
    private double number2;

    public double[] getNumbers(String text) {
        if (text.charAt(0) == '-') {
            for (int i = 1; i < text.length(); i++) {
                if (text.charAt(i) == '+' || text.charAt(i) == '-' || text.charAt(i) == '*' ||
                        text.charAt(i) == '/') {
                    try {
                        number1 = (Double.parseDouble(text.substring(1, i))) * (-1);
                        number2 = (Double.parseDouble(text.substring(i + 1)));
                    } catch (NumberFormatException e) {
                        System.out.println(e + " " + "Number must contain only digit symbols");
                        System.exit(0);
                    }
                    break;
                }
            }
        } else {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '+' || text.charAt(i) == '-' || text.charAt(i) == '*' ||
                        text.charAt(i) == '/') {
                    try {
                        number1 = (Double.parseDouble(text.substring(0, i)));
                        number2 = (Double.parseDouble(text.substring(i + 1)));
                    } catch (NumberFormatException e) {
                        System.out.println(e + " " + "Number must contain only digit symbols");
                        System.exit(0);
                    }
                    break;
                }
            }
        }
        double[] numbers = {number1, number2};
        return numbers;
    }
}
