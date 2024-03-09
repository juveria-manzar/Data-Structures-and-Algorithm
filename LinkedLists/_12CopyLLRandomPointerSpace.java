import java.util.*;
class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;
        ListNode random = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode copyRandomList(ListNode head) {

        ListNode dummyH = new ListNode(-1);
        ListNode dummyT = dummyH;

        ListNode temp = head;

        HashMap<ListNode, ListNode> map = new HashMap<>();

        while (temp != null) {
            ListNode newNode = new ListNode(temp.val);
            newNode.next = temp.next;

            map.put(temp, newNode);

            dummyT.next = newNode;
            dummyT = newNode;

            temp = temp.next;
        }

        // adding random pointers to deep copy

        ListNode p1 = head;
        ListNode p2 = dummyH.next;

        while (p1 != null && p2 != null) {
            if (p1.random == null) {
                p2.random = null;
            } else {
                p2.random = map.get(p1.random);
            }

            p1 = p1.next;
            p2 = p2.next;
        }
        return dummyH.next;
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