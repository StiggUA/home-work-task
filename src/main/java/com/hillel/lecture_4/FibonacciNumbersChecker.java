package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */

public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] result = new int[number];
        int a = 0;
        int b = 1;

        for (int i = 0; i < number; i++) {
            result[i] = a;
            int diff = a;
            a = b;
            b = diff + b;
        }
        return result;
    }
}


