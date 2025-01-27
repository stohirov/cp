package solutions.leetcode;

public class Solution11 {
    public static int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int maxSize = 0;
        while (right > left) {
            int size = (right - left) * Math.min(height[right], height[left]);
            if (size >= maxSize) {
                maxSize = size;
            }
            if (height[right] > height[left]) left++;
            else right--;
        }
        return maxSize;
    }
}
