package com.company.calculator.calculation;

import com.company.calculator.Calculation;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculationTest {

    @Test
    public void testCalculationOfExpression_checkMultiplication() {
        Calculation calculation = new Calculation();
        double[] numbers = {-2.25, 2};
        double actual = calculation.calculationOfExpression("-2.25*2", numbers);
        double expected = -4.5;
        Assertions.assertEquals(expected, actual, "Multiplication does not work");
    }

    @Test
    public void testCalculationOfExpression_checkSum() {
        Calculation calculation = new Calculation();
        double[] numbers = {8.25, 2};
        double actual = calculation.calculationOfExpression("8.25+2", numbers);
        double expected = 10.25;
        Assertions.assertEquals(expected, actual, "Sum does not work");
    }

    @Test
    public void testCalculationOfExpression_checkDivision() {
        Calculation calculation = new Calculation();
        double[] numbers = {-7.3125, 2.25};
        double actual = calculation.calculationOfExpression("-7.3125/2.25", numbers);
        double expected = -3.25;
        Assertions.assertEquals(expected, actual, "Division does not work");
    }

    @Test
    public void testCalculationOfExpression_checkSubtraction() {
        Calculation calculation = new Calculation();
        double[] numbers = {-7.5, 2.25};
        double actual = calculation.calculationOfExpression("-7.5-2.25", numbers);
        double expected = -9.75;
        Assertions.assertEquals(expected, actual, "Division does not work");
    }



}
