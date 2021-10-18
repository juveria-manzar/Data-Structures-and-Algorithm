import java.util.Scanner;

public class _2MiddleOfLL {

    public static class ListNode{
        int val;
        ListNode next;

        ListNode(){}

        ListNode(int val){
            this.val=val;
        }
    }

    public static ListNode midOfLL(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&& fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        ListNode dummy=new ListNode(-1);
        Node prev=dummy;

        while(n>0){
            prev.next=new ListNode(scn.nextInt());
            prev=prev.next;
            n--;
        }

        ListNode head=midOfLL(dummy.next);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
