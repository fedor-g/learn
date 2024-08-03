package com.leetCode.problems.romanToInteger;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        Assert.assertEquals(4, solution.romanToInt("IV"));
        Assert.assertEquals(8, solution.romanToInt("VIII"));
        Assert.assertEquals(15, solution.romanToInt("XV"));
        Assert.assertEquals(16, solution.romanToInt("XVI"));
        Assert.assertEquals(23, solution.romanToInt("XXIII"));
        Assert.assertEquals(42, solution.romanToInt("XXII"));
    }

}
