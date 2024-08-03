package com.leetCode.problems.romanToInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

class Solution {
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();

        return Nums.getNumStream().map(number -> {
            if (s.contains(number.ch.toString())) {
                List<Integer> indexes = new ArrayList<>();
                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[i] == number.ch) {
                        indexes.add(i);
                    }
                }
                return calc(indexes, charArray);
            } return null;
        }).filter(Objects::nonNull).findFirst().orElseThrow(() -> new RuntimeException("No data provided"));
    }

    private int calc(List<Integer> indexes, char[] arr) {


        return 42;
    }


    enum Nums {
        I(1, 'I'),
        V(5, 'V'),
        X(10, 'X'),
        D(50, 'D'),
        C(100, 'C'),
        M(1000, 'M');

        private int n;
        private Character ch;

        Nums(int i, Character ch) {
        }

        public static Stream<Nums> getNumStream() {
            return Stream.of(M, C, D, X, V, I);
        }
    }
}
