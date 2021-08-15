public class KReverseList {
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        public void addFirst(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;

            if (size == 0) {
                tail = newNode;
            }
            size++;
        }

        public void removeFirst(){

        }

        public void addLast(int data){

        }

        public void kReverse(int k){
            LinkedList curr=new LinkedList();
            LinkedList overall=new LinkedList();
            while(this.size>=k){

                for(int i=0;i<k;i++){
                    int data=this.head.data;
                    this.removeFirst();
                    curr.addFirst(data);
                }

                if(overall.size==0){
                    overall=curr;
                    overall.head=curr.head;
                    overall.tail=curr.tail;
                    overall.size=curr.size;
                }
                else{
                    overall.tail.next=curr.head;
                    overall.tail=curr.tail;
                    overall.size+=curr.size;
                }

                curr=new LinkedList();
            }

            while(this.size>0){
                int data=this.head.data;
                this.removeFirst();
                overall.addLast(data);
            }

            this.head=overall.head;
            this.tail=overall.tail;
            this.size=overall.size;
        }
    }

    public static void main(String[] args) {
        
    }
}
