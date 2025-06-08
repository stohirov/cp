package solutions.leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution70 {
    public int climbStairs(int n) {
        return climb(n, new HashMap<>());
    }

    private int climb(int n, Map<Integer, Integer> memo) {
        if (n <= 1) return 1;

        if (memo.containsKey(n)) return memo.get(n);

        int res = climb(n - 1, memo) + climb(n - 2, memo);
        memo.put(n, res);
        return res;
    }
}