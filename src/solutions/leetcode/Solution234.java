package solutions.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head; //ssss
        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        while (slow != null) {
            if (!stack.isEmpty() && slow.val == stack.peek()) stack.pop();
            slow = slow.next;
        }

        return stack.isEmpty();
    }
}
