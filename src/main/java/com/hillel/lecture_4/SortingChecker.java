package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result int[] data = { 20, 4, 3, 10, 2, -5, 0, -13, 1 };
        int[] result = new int[values.length];
        int i = 0;
        int count = 0;
        while (true) {
            if (values[i] > values[i + 1]) {
                int q = values[i];
                values[i] = values[i + 1];
                values[i + 1] = q;
                count = 0;
            } else {
                count++;
            }
            i++;
            if (i == values.length - 1) {
                i = 0;
            }
            if (count == values.length - 1)
                break;
        }
        result = values;

        return result;
        }

    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = new int[values.length];
        int i = 0;
        int Counter = 0;
        while (true) {
            if (values[i] < values[i + 1]) {
                int q = values[i];
                values[i] = values[i + 1];
                values[i + 1] = q;
                Counter = 0;
            } else {
                Counter++;
            }
            i++;
            if (i == values.length - 1) {
                i = 0;
            }
            if (Counter == values.length - 1)
                break;
        }
        result = values;

        return result;
    }
}

