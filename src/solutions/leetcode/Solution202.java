package solutions.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution202 {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            n = sumOfSquares(n);
            if (seen.contains(n)) {
                return false;
            } else {
                seen.add(n);
            }
        }

        return true;
    }

    public int sumOfSquares(int number) {
        int result = 0;
        while (number > 0) {
            int digit = number % 10;
            result += (digit * digit);
            number /= 10;
        }

        return result;
    }
}
