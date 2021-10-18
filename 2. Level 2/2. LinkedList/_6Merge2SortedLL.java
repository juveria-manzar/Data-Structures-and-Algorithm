import java.util.*;

public class _6Merge2SortedLL {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode dummyH = new ListNode(-1);
        ListNode dummyT = dummyH;

        ListNode p1 = h1;
        ListNode p2 = h2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                dummyT.next = p1;
                p1 = p1.next;
            } else {
                dummyT.next = p2;
                p2 = p2.next;
            }

            dummyT = dummyT.next;
        }

        if (p1 != null) {
            dummyT.next = p1;
        }

        if (p2 != null) {
            dummyT.next = p2;
        }
        return dummyH.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);
        int m = scn.nextInt();
        ListNode h2 = createList(m);

        ListNode head = mergeTwoLists(h1, h2);
        printList(head);
    }
}
