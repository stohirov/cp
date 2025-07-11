package solutions.leetcode;

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return result;
    }
}
