package com.hillel.Lecture_10;

import com.hillel.Lecture_10.Calculator.UsualCalc;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class UsualCalcTest {
    @Test public void UsualCalcPlusTest(){
        UsualCalc usualCalc = new UsualCalc();
        double result = usualCalc.plus(15, 7);
        assertEquals(result, 22.0);
    }
    @Test public void UsualCalcMinusTest(){
        UsualCalc usualCalc = new UsualCalc();
        double result = usualCalc.minus(15, 7);
        assertEquals(result, 8.0);
    }
    @Test public void UsualCalcMultiplyTest(){
        UsualCalc usualCalc = new UsualCalc();
        double result = usualCalc.multiply(15, 7);
        assertEquals(result, 105.0);
    }
    @Test public void UsualCalcDivideTest(){
        UsualCalc usualCalc = new UsualCalc();
        double result = usualCalc.divide(16, 2);
        assertEquals(result, 8.0);
    }
}
