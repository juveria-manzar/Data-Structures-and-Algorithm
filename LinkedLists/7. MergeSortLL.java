import java.util.*;

class Main { 
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

    public static ListNode midOfLL(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static ListNode mergeSort(ListNode head) {

        if (head.next == null) {
            return head;
        }
        ListNode mid = midOfLL(head);
        ListNode rightHead = mid.next;

        mid.next = null;

        ListNode leftPart = mergeSort(head);
        ListNode rightPart = mergeSort(rightHead);

        ListNode sortedHead = mergeTwoLists(leftPart, rightPart);

        return sortedHead;
    }
}