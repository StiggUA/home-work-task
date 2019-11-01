package com.hillel.lecture_4;

/**
 * Created by alpa on 10/25/19
 */
/**
 * Написать программу, которая перевод десятичные числа в двоичные и наоборот.
 */
public class BinaryToDecimalChecker {

    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;
        int i = 0;
        for (i=0; i<200; i++)
        {
            value = value/2;
            value = value%2;
            result = value%2;
            if (value == 0) break;
        }

        return result;
    }
    public int fromBinaryToDecimal(int value) {
//        TODO implements result
        int result = 0;

        return result;
    }
}
