package com.leetCode.problems.palindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        Integer y = x;
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        String string = sb.reverse().toString();
        try {
            int i = Integer.parseInt(string);
            return x == i;
        } catch (Exception e) {
            return false;
        }
    }
}