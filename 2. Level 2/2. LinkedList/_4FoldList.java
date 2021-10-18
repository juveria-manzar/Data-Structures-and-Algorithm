import java.util.Scanner;

public class _4FoldList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

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

    public static void foldList(ListNode head){
        ListNode mid=midOfLL(head);
        ListNode newHead=mid.next;
        mid.next=null;
        newHead=reverse(newHead);

        ListNode left=head;
        ListNode right=newHead;
        while(right!=null){
            //preserve
            ListNode lNode=left.next;
            ListNode rNode=right.next;

            //connect
            left.next=right;
            right.next=lNode;

            left=lNode;
            right=rNode;

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        while (n > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
            n--;
        }

        foldList(dummy.next);
        ListNode head=dummy.next;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
