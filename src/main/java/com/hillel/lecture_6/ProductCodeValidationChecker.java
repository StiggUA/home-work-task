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
       // String upper = code.toUpperCase();
        char[] lower = code.toCharArray();
        for(int i=0; i < lower.length; i++){

            //if any character is not in lower case, return false
            if(Character.isLowerCase( lower[i]))
                return isValid;
        }
        String[] parts = code.split(" ");
        String part1 = parts[0];
        part1 = part1.replaceAll("[^0-9]", "");
        String part2 = parts[1];

        char[] charPart1 = part1.toCharArray();

        String a = Character.toString(charPart1[0]);
        String b = Character.toString(charPart1[1]);
        String c = Character.toString(charPart1[2]);
        String d = Character.toString(charPart1[3]);
        String e = Character.toString(charPart1[4]);
        String f = Character.toString(charPart1[5]);

        String first = a + b;
        String second = c + d;
        String third = e + f;

        int z = Integer.parseInt(first);
        int x = Integer.parseInt(second);
        int q = Integer.parseInt(third);
        int k = z * x * q;
        String res = Integer.toString(k);

       if (res.equals(part2))
           isValid = true;

       return isValid;
    }
}