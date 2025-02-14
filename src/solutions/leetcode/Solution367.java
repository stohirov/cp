package solutions.leetcode;

public class Solution367 {
    public static boolean isPerfectSquare(int num) {
        int high = num;
        int low = 0;

        while (low <= high) {

            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else if (mid * mid > num) {
                high = (int) mid - 1;
            }

        }

        return false;
    }
}
