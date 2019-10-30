package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */

/**
 * Написать программу, которая проверяет является ли строка палиндромом (использовать массив символов - char string[])
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        boolean result = false;
        int a = value.length();
        for (int i  = 0; i < (a/2); i++)
            if (value.charAt(i) != value.charAt(a-1)) {
                return false;
            }
        else {
            return true;
            }
        return result;
    }

}
