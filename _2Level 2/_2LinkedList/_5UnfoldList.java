import java.util.Scanner;

public class _5UnfoldList {

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

    public static void unfoldList(ListNode head){
        ListNode dummyLeft=new ListNode(-1);
        ListNode leftTail=dummyLeft;

        ListNode dummyRight=new ListNode(-1);
        ListNode rightTail=dummyRight;

        boolean flag =true;
        ListNode temp=head;

        while(temp!=null){
            if(flag==true){
                leftTail.next=temp;
                leftTail=leftTail.next;
            }else{
                rightTail.next=temp;
                rightTail=rightTail.next;
            }

            flag=!flag;
            temp=temp.next;
        }

        dummyRight=reverse(dummyRight.next);
        leftTail.next=dummyRight;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ListNode dummy = new ListNode(-1);
        Node prev = dummy;

        while (n > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
            n--;
        }

        unfoldList(dummy.next);
        ListNode head=dummy.next;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
