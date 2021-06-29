public class LinkedListReverse {
    
    public class Node{
        int data;
        Node next;
    }

    public class LinkedList{
        Node head;
        Node tail;
        int size;

        void addFirst(int val){
            Node newNode=new Node();
            newNode.data=val;

            if(size==0){
                this.head=this.tail=newNode;
            }
            else{
                newNode.next=head;
                head=newNode;
            }
            size++;
        }

        void reverseDataIterative(){
            
        }

    }    
}
