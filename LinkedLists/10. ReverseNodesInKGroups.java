import java.util.*;

class Main {
    public static ListNode reverseInKGroup(ListNode head, int k) {

        ListNode ansHead=null;
        ListNode ansTail=null;

        int count=size(head);

        ListNode temp=head;

        while(k>=count){
            ListNode currHead=null;
            ListNode currTail=null;
            for(int i=1;i<=k;i++){
                ListNode next=temp.next;

                temp.next=null;
                //add first
                if(currHead==null){
                    currHead=currTail=temp;
                }else{
                    temp.next=currHead;
                    currHead=temp;
                }
                temp=next;
                count--;
            }

            if(ansHead==null){
                ansHead=currHead;
                ansTail=currTail;
            }else{
                ansTail.next=currHead;
                ansTail=currTail;
            }
        }

        if(count>0){
            ansTail.next=temp;
        }

        return ansHead;

    }
}