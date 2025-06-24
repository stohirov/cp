package solutions;

import solutions.codingbat.String2;
import solutions.leetcode.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node6 = new ListNode(6);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node66 = new ListNode(6);
        node1.next = node2;
        node2.next = node6;
        node6.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node66;

        ListNode res = Solution203.removeElements(node1, 6);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}