import java.util.*;

class Main {

    public static ListNode reverseInRange(ListNode head, int l, int r) {
        ListNode ptr1 = null;
        ListNode ptr2 = null;

        ListNode currH = null;
        ListNode currT = null;

        int pos = 1;
        ListNode temp = head;
        while (temp != null) {

            if (pos < l) {
                ptr1 = temp;
                temp = temp.next;
            } else if (pos >= l && pos <= r) {
                ListNode next = temp.next;
                temp.next = null;
                if (currH == null) {
                    currH = currT = temp;
                } else {
                    temp.next = currH;
                    currH = temp;
                }
                temp = next;
            } else {
                ptr2 = temp;
                break;
            }
            pos++;
        }

        if (ptr1 != null) {
            ptr1.next = currH;
            currT.next = ptr2;
            return head;
        } else {
            currT.next = ptr2;
            return currH;
        }

    }
}