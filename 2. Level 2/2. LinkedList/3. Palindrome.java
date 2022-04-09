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

    public static boolean isPalindrome(ListNode head) {
        ListNode mid = midOfLL(head);
        ListNode newHead = mid.next;
        mid.next = null;
        newHead = reverse(newHead);

        ListNode p1 = head;
        ListNode p2 = newHead;

        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        newHead = reverse(newHead);
        mid.next = newHead;

        return true;
    }
}
