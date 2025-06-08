package solutions.leetcode;

public class Solution171 {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        int i = 0;
        while (i < columnTitle.length()) {
            char c = columnTitle.charAt(i);
            int num = c - 'A' + 1;
            result = result * 26 + num;
            i++;
        }
        return result;
    }
}
