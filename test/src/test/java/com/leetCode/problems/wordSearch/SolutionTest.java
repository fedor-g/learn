package com.leetCode.problems.wordSearch;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        Assert.assertTrue(solution.exist(board, word));
    }
    
    @Test
    public void test2() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        Assert.assertTrue(solution.exist(board, word));
    }

    @Test
    public void test3() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        Assert.assertFalse(solution.exist(board, word));
    }
}
