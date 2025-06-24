package solutions.leetcode;

public class Solution203 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode(0, head);
        ListNode dummyNode = res;

        while (dummyNode != null) {
            while (dummyNode.next != null && dummyNode.next.val == val) {
                dummyNode.next = dummyNode.next.next;
            }
            dummyNode = dummyNode.next;
        }

        return res.next;
    }
}
