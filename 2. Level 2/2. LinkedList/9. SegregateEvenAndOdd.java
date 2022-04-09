import java.util.*;

class Main {
    
    public static ListNode segregateEvenOdd(ListNode head) {
        ListNode evenH = new ListNode(-1);
        ListNode evenT = evenH;
        ListNode oddH = new ListNode(-1);
        ListNode oddT = oddH;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val % 2 == 0) {
                evenT.next = temp;
                evenT = evenT.next;

            } else {
                oddT.next = temp;
                oddT = oddT.next;
            }

            temp = temp.next;
        }

        oddT.next = null;

        evenT.next = oddH.next;
        return evenH.next;
    }

}