package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    public int getMaxNumber(int a, int b, int c) {

//        TODO implements result
        int result = 0;
        if (a < b && a < c && a < b && b < c && c > a && c > b) {
            result = c;
        }
        return result;
    }

    public int getAverageNumber(int a, int b, int c) {

//        TODO implements result
        int result = 0;
        if (a < b && a < c && a < b && b < c && c > a && c > b) {
            result = b;
        }
        return result;
    }

    public int getMinNumber(int a, int b, int c) {

//        TODO implements result
        int result = 0;
        if (a < b && a < c && a < b && b < c && c > a && c > b) {
            result = a;
        }
        return result;
    }
}
