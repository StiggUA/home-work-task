package com.hillel.basic.exam;

/**
 * Take a number: 56789. Rotate left, you get 67895.
 * Keep the first digit in place and rotate left the other digits: 68957.
 * Keep the first two digits in place and rotate the other ones: 68579.
 * Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains
 * only one digit which rotated is itself.
 * <p>
 * You have the following sequence of numbers:
 * 56789 -> 67895 -> 68957 -> 68579 -> 68597
 * and you must return the greatest: 68957.
 * <p>
 * Calling this function max_rot (or maxRot or ... depending on the language)
 * max_rot(56789) should return 68957
 */

//        String res = word;
//        for (int i = 1; i < word.length(); i++) {
//        res = res.substring(1) + res.charAt(0);
//        result = result + ", " + res;
//        }

public class NumberRotator {

    public static long rotate(long n) {
        String l = Long.toString(n);
        String res = l;
        long result = 0;


        for (int i = 0; i < 1; i++) {
            res = res.substring(1) + res.charAt(0);
            long num = Long.parseLong(res);
            result = num;
            for (int j = 0; j < 1; j++) {
                res = res.substring(1) + res.charAt(0);
            }
        }
        System.out.println();
            return result;

        }
    }
