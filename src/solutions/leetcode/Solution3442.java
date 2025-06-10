package solutions.leetcode;

import java.time.temporal.ChronoUnit;
import java.util.*;

public class Solution3442 {
    public static int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        for (Character c: map.keySet()) {
            int currValue = map.get(c);
            if (currValue > max && currValue % 2 != 0) max = currValue;
            if (currValue < min && currValue % 2 == 0) min = currValue;
        }

        return max - min;
    }
}
