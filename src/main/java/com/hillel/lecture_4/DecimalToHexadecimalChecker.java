package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result = ""; {
            result = Integer.toHexString(value);
            result = result.toUpperCase() ;
        }
        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        int result = 0;
        {
            result = Integer.parseInt(value, 16);
        }
        return result;
    }
}
