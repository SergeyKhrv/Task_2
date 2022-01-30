package com.company.calculator.calculation;

import com.company.calculator.Numbers;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumbersTest {

    @Test
    public void testGetNumbersForSumExpression_firstDigitIsNegative(){
        Numbers numbers = new Numbers();
        String text = "-3.25+6.25";
        double[] actual = numbers.getNumbers(text);
        double[] expected = {-3.25, 6.25};
        Assertions.assertArrayEquals(expected, actual, "Numbers are not received");
    }

    @Test
    public void testGetNumbersForSumExpression_firstDigitIsPositive(){
        Numbers numbers = new Numbers();
        String text = "3.25+6.25";
        double[] actual = numbers.getNumbers(text);
        double[] expected = {3.25, 6.25};
        Assertions.assertArrayEquals(expected, actual, "Numbers are not received");
    }

    @Test
    public void testGetNumbersForSubtractExpression_firstDigitIsNegative(){
        Numbers numbers = new Numbers();
        String text = "-3.25-6.25";
        double[] actual = numbers.getNumbers(text);
        double[] expected = {-3.25, 6.25};
        Assertions.assertArrayEquals(expected, actual, "Numbers are not received");
    }

    @Test
    public void testGetNumbersForSubtractExpression_firstDigitIsPositive(){
        Numbers numbers = new Numbers();
        String text = "3.25-6.25";
        double[] actual = numbers.getNumbers(text);
        double[] expected = {3.25, 6.25};
        Assertions.assertArrayEquals(expected, actual, "Numbers are not received");
    }

    @Test
    public void testGetNumbersForMultiplicationExpression_firstDigitIsNegative(){
        Numbers numbers = new Numbers();
        String text = "-3.25*6.25";
        double[] actual = numbers.getNumbers(text);
        double[] expected = {-3.25, 6.25};
        Assertions.assertArrayEquals(expected, actual, "Numbers are not received");
    }

    @Test
    public void testGetNumbersForDivisionExpression_firstDigitIsNegative(){
        Numbers numbers = new Numbers();
        String text = "-3.25/6.25";
        double[] actual = numbers.getNumbers(text);
        double[] expected = {-3.25, 6.25};
        Assertions.assertArrayEquals(expected, actual, "Numbers are not received");
    }

    @Test
    public void testGetNumbersForDivisionExpression_firstDigitIsPositive(){
        Numbers numbers = new Numbers();
        String text = "3.25/6.25";
        double[] actual = numbers.getNumbers(text);
        double[] expected = {3.25, 6.25};
        Assertions.assertArrayEquals(expected, actual, "Numbers are not received");
    }
}
