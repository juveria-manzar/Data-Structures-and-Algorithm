import java.util.Scanner;

class Main {

    public static ListNode midOfLL(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            // preserve
            ListNode next = curr.next;

            // work
            curr.next = prev;

            // move
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void foldList(ListNode head) {
        ListNode mid = midOfLL(head);
        ListNode newHead = mid.next;
        mid.next = null;
        newHead = reverse(newHead);

        ListNode left = head;
        ListNode right = newHead;
        while (right != null) {
            // preserve
            ListNode lNode = left.next;
            ListNode rNode = right.next;

            // connect
            left.next = right;
            right.next = lNode;

            //move
            left = lNode;
            right = rNode;

        }
    }
}
