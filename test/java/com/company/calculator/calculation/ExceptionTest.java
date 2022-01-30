package com.company.calculator.calculation;

import com.company.calculator.Calculation;
import com.company.calculator.Numbers;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExceptionTest {

    @Test (expected = NumberFormatException.class)
    public void testGetNumbers_getNumberFormatException_1() {
        Numbers numbers = new Numbers();
        String text = "-3.25++6.25";
        double[] array = numbers.getNumbers(text);
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Double.parseDouble(String.valueOf(array[1]));
        });
    }

    @Test (expected = NumberFormatException.class)
    public void testGetNumbers_getNumberFormatException_2() {
        Numbers numbers = new Numbers();
        String text = "-3.25--6.25";
        double[] array = numbers.getNumbers(text);
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Double.parseDouble(String.valueOf(array[1]));
        });
    }

    @Test (expected = NumberFormatException.class)
    public void testGetNumbers_getNumberFormatException_3() {
        Numbers numbers = new Numbers();
        String text = "--3.25+6.25";
        double[] array = numbers.getNumbers(text);
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Double.parseDouble(String.valueOf(array[0]));
        });
    }

    @Test (expected = NumberFormatException.class)
    public void testGetNumbers_getNumberFormatException_4() {
        Numbers numbers = new Numbers();
        String text = "-3.25//6.25";
        double[] array = numbers.getNumbers(text);
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Double.parseDouble(String.valueOf(array[1]));
        });
    }

    @Test (expected = NumberFormatException.class)
    public void testGetNumbers_getNumberFormatException_5() {
        Numbers numbers = new Numbers();
        String text = "3.25**6.25";
        double[] array = numbers.getNumbers(text);
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Double.parseDouble(String.valueOf(array[1]));
        });
    }

    @Test (expected = NumberFormatException.class)
    public void testGetNumbers_getNumberFormatException_6() {
        Numbers numbers = new Numbers();
        String text = "++3.25**6.25";
        double[] array = numbers.getNumbers(text);
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Double.parseDouble(String.valueOf(array[1]));
        });
    }

    @Test (expected = ArithmeticException.class)
    public void calculationOfExpression_getArithmeticException() {
        Calculation calculation = new Calculation();
        double[] numbers = {-8.25, 0};
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculation.calculationOfExpression("-8.25/0", numbers);
        });
    }
}
