import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = segregateEvenOdd(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}