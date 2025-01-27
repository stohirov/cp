package solutions.leetcode;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) count++;
        }
        return nums.length - count;
    }
}
