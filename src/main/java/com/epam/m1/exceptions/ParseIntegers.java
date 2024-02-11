package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */

public class ParseIntegers {



    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));


    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        StringBuilder justWordsBuilder = new StringBuilder();

        String justWords = "";
        while (words.hasNext()) {
            String next = words.next();

            try {
                int number = Integer.parseInt(next);
                sum += number;
            } catch (NumberFormatException e) {
                justWordsBuilder.append(next).append(" ");
            }

        }


        justWords = justWordsBuilder.toString().trim();
        System.out.println("Sum is " + sum);
        System.out.println("Just words: " + justWords);



    }
}

