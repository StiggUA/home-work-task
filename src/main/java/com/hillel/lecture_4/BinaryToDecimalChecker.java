package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */

/**
 * Написать программу, которая перевод десятичные числа в двоичные и наоборот.
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;
        int b = 0;
        int i = 0;
        String x = "";

        while(value > 0)
        {
            i = value % 2;
            if(i == 1)
            {
                b++;
            }
            x = i + "" + x;
            value = value / 2;

            result = Integer.parseInt(x);
        }
        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        int n = 0;
        while(true){
            if(value == 0){
                break;
            } else {
                int i = value % 10;
                result += i * Math.pow(2, n);
                value = value / 10;
                n++;
            }
        }
        return result;
    }
}
