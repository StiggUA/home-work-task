package com.hillel.Lecture_10;

import com.hillel.Lecture_10.Calculator.Engineer;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class EngineerCalcTest {
    @Test public void sqrtTest() {
        Engineer engineer = new Engineer();
        double result = engineer.sqrt(144);
        assertEquals(result, 12.0);
    }
    @Test public void sinTest() {
        Engineer engineer = new Engineer();
        double result = engineer.sin(57);
        assertEquals(result, 0.43616475524782494);
    }
    @Test public void dayToSecTest() {
        Engineer engineer = new Engineer();
        double result = engineer.dayToSec(2);
        assertEquals(result, 172800.0);
    }
    @Test public void celsiusToFahrenheitTest() {
        Engineer engineer = new Engineer();
        double result = engineer.celsiusToFahrenheit(50);
        assertEquals(result, 122.0);
    }
    @Test public void degreesTest() {
        Engineer engineer = new Engineer();
        double result = engineer.degrees(180);
        assertEquals(result, 1.2246467991473532E-16);
    }
    @Test public void poundsToKilosTest() {
        Engineer engineer = new Engineer();
        double result = engineer.poundsToKilograms(80);
        assertEquals(result, 36,287761952);
    }
}
