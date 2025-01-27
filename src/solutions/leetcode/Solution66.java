package solutions.leetcode;

public class Solution66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumbers = new int[n + 1];
        newNumbers[0] = 1;
        return newNumbers;
    }
}
