package com.leetCode.problems.longestSubstringWithoutRepeatingCharacters;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Solution {
    private Set<String> subStrings = new HashSet<>();
    private Set<Character> foundChars = new HashSet<>();
    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
           if (!foundChars.contains(charArray[i])) {
               foundChars.add(charArray[i]);
               subStrings.add(String.valueOf(charArray[i]));
               for (int j = i + 1; j < charArray.length; j++) {
                   String substring = s.substring(i, j);
                   subStrings.add(substring);
               }

           } else {

           }
        }

        Optional<String> max = subStrings.stream().max(Comparator.comparingInt(String::length));
        return max.get().length();
    }
}
