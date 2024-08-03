package com.leetCode.problems.wordSearch;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<String> list = new ArrayList<>();

    public boolean exist(char[][] board, String word) {
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[0].length; i++) {
                list.clear();
                char c = word.charAt(0);
                char c1 = board[j][i];
                if (c == c1) {
                    list.add(i + "" + j);
                    boolean result = findWord(board, word, i, j, 1);
                    if (result) return true;
                }
            }
        }
        return false;
    }

    private boolean findWord(char[][] board, String word, int i, int j, int pos) {
        if (pos == word.length() - 1) return true;

        char newChar = word.charAt(pos);

        try {
            int j2 = j - 1;
            char c = board[i][j2];
            if (!list.contains(i + "" + j2) && newChar == c) {
                list.add(i + "" + j2);
                findWord(board, word, i, j2, ++pos);
            }
        } catch (IndexOutOfBoundsException ignored) {

        }
        try {
            int i2 = i + 1;
            char c = board[i2][j];
            if (!list.contains(i2 + "" + j) && newChar == c) {
                list.add(i2 + "" + j);
                findWord(board, word, i2, j, ++pos);
            }
        } catch (IndexOutOfBoundsException ignored) {

        }
        try {
            int j2 = j + 1;
            char c = board[i][j2];
            if (!list.contains(i + "" + j2) && newChar == c) {
                list.add(i + "" + j2);
                findWord(board, word, i, j2, ++pos);
            }
        } catch (IndexOutOfBoundsException ignored) {

        }
        try {
            int i2 = i - 1;
            char c = board[i2][j];
            if (!list.contains(i2 + "" + j) && newChar == c) {
                list.add(i2 + "" + j);
                findWord(board, word, i2, j, ++pos);
            }
        } catch (IndexOutOfBoundsException ignored) {

        }
        return false;
    }
}
