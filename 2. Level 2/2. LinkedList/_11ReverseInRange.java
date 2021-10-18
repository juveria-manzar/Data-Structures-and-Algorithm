import java.util.*;

class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

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
        int sz = scn.nextInt();
        ListNode h1 = createList(sz);

        int m = scn.nextInt();
        int n = scn.nextInt();

        h1 = reverseInRange(h1, m, n);
        printList(h1);
    }
}