import java.util.Scanner;

class Main {
    
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
}

