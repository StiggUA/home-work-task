package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;

        code = code.replaceAll("[^0-9]+", "");


        int count = 0;

        /*System.out.println(split);

        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (s.length() == 1);

                }*/
        return isValid;
    }
}

        /*char charAt = code.charAt(0);
        char charAt1 = code.charAt(1);
        char charAt2 = code.charAt(2);
        char charAt3 = code.charAt(3);
        char charAt4 = code.charAt(4);
        char charAt5 = code.charAt(5);

        String ch1 = Character.toString(charAt);
        String ch2 = Character.toString(charAt1);
        String ch3 = Character.toString(charAt2);
        String ch4 = Character.toString(charAt3);
        String ch5 = Character.toString(charAt4);
        String ch6 = Character.toString(charAt5);

        String first = ch1 + ch2;
        String second = ch3 + ch4;
        String third = ch5 + ch6;

        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        int c = Integer.parseInt(third);

        if (a*b*c ==*/