package com.hillel.Lecture_10;

import com.hillel.Lecture_10.Calculator.Financial;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class FinancialCalcTest {
    @Test
        public void discountTest(){
        Financial financial = new Financial();
        double result = financial.discount(2000);
        assertEquals(result, 300.0);
    }
    @Test public void perpetTest() {
        Financial financial = new Financial();
        double result = financial.perpet(7000);
        assertEquals(result, 194.44444444444446);
    }
    @Test public void perpetTest2() {
        Financial financial = new Financial();
        double result = financial.perpet(2500);
        assertEquals(result, 104.16666666666667);}

    @Test public void perpetTest3() {
        Financial financial = new Financial();
        double result = financial.perpet(800);
        assertEquals(result, 66.66666666666667);}

    @Test public void credit() {
        Financial financial = new Financial();
        double result = financial.credit(7000, 5);
        assertEquals(result, 8190.0);
    }
}
