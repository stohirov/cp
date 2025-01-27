package solutions.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int aPointer = 0;
        int bPointer = 0;
        Set<Character> characters = new HashSet<>();

        while (bPointer < s.length()) {

            if (!characters.contains(s.charAt(bPointer))) {
                characters.add(s.charAt(bPointer));
                bPointer++;
                maxLength = Math.max(maxLength, characters.size());
            } else {
                characters.remove(s.charAt(aPointer));
                aPointer++;
            }
        }
        return maxLength;
    }
}
