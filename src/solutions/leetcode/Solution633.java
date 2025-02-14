package solutions.leetcode;

public class Solution633 {
    public static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (int) Math.sqrt(c);

        while (start <= end) {
            long sum = start * start + end * end;

            if (sum == c) {
                return true;
            } else if (sum > c) {
                end--;
            } else if (sum < c) {
                start++;
            }
        }
        return false;
    }
}
