package com.hillel.lecture_4;

import edu.emory.mathcs.backport.java.util.Arrays;
import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */

/**
 * Написать программу, которая выводит все числа Фибоначчи до заданного числа
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] result = { };
        int[] list = new int[20];
        int w;
        int z = 1;
        for (int i = 0; i < 20; i++) {
            w = z + number;
            list [0+1] = w;
            z = number;
            number = w;
                        }
        int size = list.length;

        return result;
    }

}
