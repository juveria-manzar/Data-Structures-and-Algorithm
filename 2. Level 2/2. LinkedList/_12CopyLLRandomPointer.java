import java.util.*;

class Main {

    public static ListNode copyRandomList(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            ListNode next = temp.next;

            ListNode newNode = new ListNode(temp.val);

            temp.next = newNode;
            newNode.next = next;

            temp = next;
        }

        ListNode p1 = head;

        while (p1 != null) {
            ListNode p2 = p1.next;
            if (p1.random == null) {
                p2.random = null;
            } else {
                p2.random = p1.random.next;
            }

            p1 = p1.next.next;
        }

        ListNode ansHead = head.next;

        ListNode h1 = head;
        ListNode h2 = ansHead;

        while (h1 != null) {
            ListNode n1 = h2.next;

            ListNode n2 = null;

            if (n1 != null) {
                n2 = n1.next;
            }

            h1.next = n1;
            h2.next = n2;

            h1 = n1;
            h2 = n2;
        }

        return ansHead;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ListNode[] arr = new ListNode[n];
        ListNode prev = null;

        for (int i = 0; i < n; i++) {
            arr[i] = new ListNode(0);
            if (prev != null)
                prev.next = arr[i];
            prev = arr[i];
        }

        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            int idx = scn.nextInt();

            arr[i].val = val;
            if (idx != -1)
                arr[i].random = arr[idx];
        }

        ListNode head = copyRandomList(arr[0]);
        while (head != null) {
            System.out.print("(" + head.val + ", " + (head.random != null ? head.random.val : -1) + ") ");
            head = head.next;
        }
    }
}