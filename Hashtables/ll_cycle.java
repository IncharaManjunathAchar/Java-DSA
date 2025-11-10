package Hashtables;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ll_cycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("No cycle");
            return;
        }

        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        int pos = sc.nextInt();
        if (pos >= 0) {
            temp = head;
            for (int i = 0; i < pos; i++) temp = temp.next;
            ListNode end = head;
            while (end.next != null) end = end.next;
            end.next = temp;
        }

        ll_cycle obj = new ll_cycle();
        boolean result = obj.hasCycle(head);

        if (result) System.out.println("Cycle detected");
        else System.out.println("No cycle");
    }
}
