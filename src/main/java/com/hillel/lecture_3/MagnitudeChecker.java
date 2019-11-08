package com.hillel.lecture_3;


/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "";
        if ((a*2) < (b*2)) {
            result = "The number " + b + " has the greatest magnitude!";
        }
        else if (0 + a == Math.abs(0 + b)){
        result = "The number " + a + " and " + b + " are equals by magnitude!";

        }
        else {
            result = "The number " + b + " has the greatest magnitude!";
        }

        return result;
    }
}
