package solutions.leetcode;

public class Solution189 {
    private void reverse(int[] nums, int positionFrom, int positionTo) {
        while (positionFrom < positionTo) {

            int temp = nums[positionFrom];
            nums[positionFrom] = nums[positionTo];
            nums[positionTo] = temp;

            positionTo--;
            positionFrom++;
        }

    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
}
