package com.linkedin.valuesToString;

// Java code​​​​​​‌​‌‌​‌​‌‌​​​‌​​​‌​​​‌​​‌‌ below
// Write your answer here, and then test your code.
// Your job is to implement the transformValues() method.

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

class Answer {

    // Change these boolean values to control whether you see
    // the expected answer and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Transform an array of numbers into a comma-delimited list
    // using functional programming.
    static String transformValues(int[] numbers) {
        // Your code goes here.

        return Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining(", "));
    }

}
