public class OddEvenList{
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

        public void OddEven(){
            LinkedList odd=new LinkedList();
            LinkedList even=new LinkedList();

            while(this.size>0){
                int data=this.head.data;
                this.removeFirst();

                if(data%2==0){
                    even.addLast(data);
                }else{
                    odd.addLast(data);
                }
            }

            if(even.size>0&& odd.size>0){
                this.head=odd.head;
                odd.tail.next=even.head;
                this.tail=even.tail;
                this.size=even.size+odd.size;
            }else if(odd.size>0){
                this.head=odd.head;
                this.tail=odd.tail;
                this.size=odd.size;
            }else{
                this.head=even.head;
                this.tail=even.tail;
                this.size=even.size;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}