package com.hillel.lecture_7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FractionNumbersTestTask {


    @Test public void FractionNumbersPlusTask() {
        FractionNumbers fractionNumbers = new FractionNumbers(20, 4);
        double result = fractionNumbers.plus();
        assertEquals(result, 24.0);
        assertEquals(fractionNumbers.toString(), "Default number are: " + 20.0 + " and " + 4.0);
    }
    @Test public void FractionNumbersMinusTask() {
        FractionNumbers fractionNumbers = new FractionNumbers(20, 4);
        double result = fractionNumbers.minus();
    assertEquals(result, 16.0);}

    @Test public void FractionNumbersMultiplyTask() {
        FractionNumbers fractionNumbers = new FractionNumbers(20, 4);
        double result = fractionNumbers.multiply();
    assertEquals(result, 80.0);}

    @Test public void FractionNumbersDivideTask() {
        FractionNumbers fractionNumbers = new FractionNumbers(20, 4);
        double result = fractionNumbers.divide();
        assertEquals(result, 5.0);}




}
