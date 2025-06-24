package solutions.leetcode;

public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
