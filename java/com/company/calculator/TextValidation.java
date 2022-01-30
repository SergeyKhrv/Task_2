package com.company.calculator;

import java.util.Scanner;

public class TextValidation {
    private String text;

    public TextValidation(String text) {
        this.text = text;
    }

    public String isTextCorrect(String text) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            if (text.isEmpty()) {
                System.out.println("Enter expression for calculation");
                flag = true;
                text = scanner.nextLine();
            }
            for (int i = 0; i < text.length(); i++) {
                if (String.valueOf(text.charAt(i)).matches("[a-zA-Z]")) {
                    System.out.println("Enter expression without letters");
                    flag = true;
                    text = scanner.nextLine();
                    break;
                } else {
                    flag = false;
                }
            }
        }
        return text;
    }
}