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
    @Test public void credit() {
        Financial financial = new Financial();
        double result = financial.credit(7000, 5);
        assertEquals(result, 8190.0);
    }
}
