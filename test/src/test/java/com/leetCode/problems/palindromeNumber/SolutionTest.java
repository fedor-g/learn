package com.leetCode.problems.palindromeNumber;

import org.junit.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void test1() {
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(0));
        System.out.println(solution.isPalindrome(-1));
        System.out.println(solution.isPalindrome(122));
    }
}
