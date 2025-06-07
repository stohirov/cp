package solutions.leetcode;

public class Solution67 {
    public String addBinary(String a, String b) {
        int carry = 0;
        int pointerA = a.length() - 1, pointerB = b.length() - 1;
        StringBuilder result = new StringBuilder();

        while (pointerA >= 0 || pointerB >= 0 || carry != 0) {
            int digitA = (pointerA >= 0) ? a.charAt(pointerA) - '0' : 0;
            int digitB = (pointerB >= 0) ? b.charAt(pointerB) - '0' : 0;

            int sum = digitA + digitB + carry;

            result.append(sum % 2);

            carry = sum / 2;

            pointerA--;
            pointerB--;
        }

        return result.reverse().toString();
    }
}
