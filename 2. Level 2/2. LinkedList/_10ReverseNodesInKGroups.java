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

    public static int size(ListNode head){
        int count=0;
        ListNode temp=head;

        while(temp!=null){
            temp=temp.next;
            count++;
        }

        return count;
    }
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
        int n = scn.nextInt();
        ListNode h1 = createList(n);

        int k = scn.nextInt();
        h1 = reverseInKGroup(h1, k);
        printList(h1);
    }
}