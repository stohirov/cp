package solutions.leetcode;

public class Solution168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber != 0) {
            columnNumber--;
            char c = (char)('A' + (columnNumber % 26));
            columnNumber /= 26;
            result.append(c);
        }

        return result.reverse().toString();
    }
}
