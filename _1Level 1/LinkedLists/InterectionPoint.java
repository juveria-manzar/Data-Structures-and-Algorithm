public class InterectionPoint {

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        int size;
        Node head;
        Node tail;


        public Node findIntersection(LinkedList l1, LinkedList l2){
            int size1=l1.size;
            int size2=l2.size;
    
            int delta=Math.abs(size1-size2);
            Node temp1=l1.head;
            Node temp2=l2.head;
            if(size1>size2){
                for(int i=0;i<delta;i++){
                    temp1=temp1.next;
                }
            }else if(size2>size1){
                for(int i=0;i<delta;i++){
                    temp2=temp2.next;
                }
            }
    
            while(temp1!=temp2){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            return temp1;
        }
    }
    
    public static void main(String[] args) {
        //input can be managed
    }
}
