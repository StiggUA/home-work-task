package com.hillel.Lecture_10;

import com.hillel.Lecture_10.Calculator.Accounting;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class AccountingCalcTest {
    @Test public void markUpTest() {
        Accounting accounting = new Accounting();
        long result = accounting.markUp(500, 20);
        assertEquals(result, 600);
    }
    @Test public void markDownTest(){
        Accounting accounting = new Accounting();
        long result = accounting.murkDown(600);
        assertEquals(result, 500);
    }
    @Test public void VATTest(){
        Accounting accounting = new Accounting();
        long result = accounting.VAT(1000, 15);
        assertEquals(result, 1150);
    }
    @Test public void currencyTest(){
        Accounting accounting = new Accounting();
        long result = accounting.currency(2000);
        assertEquals(result, 48400);
    }
}
