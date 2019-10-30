package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class DivisorChecker {

    public String checkDivisor(int divisor, int number) {
        //        TODO implements result
        String result = "The number " + number + " is divisor of the number 10";
        if (divisor%number == 0 || number%divisor == 0);
        else {
            result = "The number " + number + " is not divisor of the number 50";
        }

        return result;
    }
}
