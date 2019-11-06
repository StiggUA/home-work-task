package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = "";
        int len = word.length();

        // Generate all rotations one by one and print
        StringBuffer sb;

        for (int i = 0; i < len; i++) {
            sb = new StringBuffer();

            int j = i;  // Current index in str
            int k = 0;  // Current index in temp

            for (int k2 = j; k2 < word.length(); k2++) {
                sb.insert(k, word.charAt(j));
                k++;
                j++;
            }

            j = 0;
            while (j < i) {
                sb.insert(k, word.charAt(j));
                j++;
                k++;
            }
            result = word;
        }
        return result;
    }

}
