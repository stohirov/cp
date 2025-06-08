package solutions.leetcode;

import java.util.Arrays;

public class Solution268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }

        for (int num: nums) {
            res -= num;
        }

        return res;
    }
}
