package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class DiscountCountChecker {

    public double checkDiscountCount(double price) {

//        TODO implements result
        double result = 0.0;
        if (price > 1000){
            result = price - (price/100*15);
        }
        else {
            result = result;
        }

        return result;
    }
}
