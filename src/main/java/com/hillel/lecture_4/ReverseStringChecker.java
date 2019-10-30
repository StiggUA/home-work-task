package com.hillel.lecture_4;

import io.qameta.allure.Step;

import java.nio.CharBuffer;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        String result = "";
        int a = value.length();
        char [] hey = value.toCharArray();
        for (int i = a - 1; i >= 0; i --){
            result = result + hey[i];

        }
        return result;
    }

}
