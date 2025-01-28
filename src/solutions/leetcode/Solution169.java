package solutions.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key: map.keySet()) {
            if (map.get(key) > (nums.length / 2)) return key;
        }

        // Arrays.sort(nums);
        // int n = nums.length;
        // return nums[n/2];

        return 1;
    }
}
