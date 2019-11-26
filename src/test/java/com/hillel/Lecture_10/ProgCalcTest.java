package com.hillel.Lecture_10;

import com.hillel.Lecture_10.Calculator.Programming;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class ProgCalcTest {
    @Test public void cycleCountTest() {
        Programming programming = new Programming();
        int result = programming.cycleCount(80);
        assertEquals(result, 80);
    }
    @Test public void starsTest() {
        Programming programming = new Programming();
        int result = programming.stars(3);
        assertEquals(result, 3);
    }
}
