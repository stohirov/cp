package solutions.leetcode;

public class Solution704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;
            int midNum = nums[middle];

            if (midNum == target) {
                return middle;
            } else if (midNum < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }
        return -1;
    }
}
