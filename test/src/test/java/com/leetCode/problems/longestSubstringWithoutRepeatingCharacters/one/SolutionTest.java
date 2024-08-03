package com.leetCode.problems.longestSubstringWithoutRepeatingCharacters.one;


import com.leetCode.problems.longestSubstringWithoutRepeatingCharacters.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void test1() {
        String s = "abcabcbb";

        int i = solution.lengthOfLongestSubstring(s);

        Assert.assertEquals(3, i);
    }

    @Test
    public void test2() {
        String s = "bbbbb";

        int i = solution.lengthOfLongestSubstring(s);

        Assert.assertEquals(1, i);
    }

}
