public class LinkedList {

    public static class Node{
        int data;
        Node next;    
    }

    public static class MyLinkedList{
        Node head;
        Node tail;
        int size;

        int size(){
            return this.size;
        }

        void display(){
            Node temp=this.head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        void addLast(int val){
            Node newNode=new Node();
            newNode.data=val;
            newNode.next=null;

            if(size==0){
                head=tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
            size++;
        }

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

        Node getNodeAt(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp;
        }

        void addAt(int idx, int val){
            if(idx==0){
                addFirst(val);
            }else if(idx==size){
                addLast(val);
            }else if(idx<0 || idx >size){
                System.out.println("invalid arguments");
            }else{
                Node newNode=new Node();
                newNode.data=val;
                newNode.next=null;

                //targetNode-> idx-1 node
                Node targetNode=getNodeAt(idx-1);
                newNode.next=targetNode.next;
                targetNode.next=newNode;

                size++;
            }
        }

        void removeLast(){
            if(size==0){
                System.out.println("List is empty");
            }else if(size==1){
                head=tail=null;
                size--;
            }else{
                Node newTail=getNodeAt(size-2); //second last node will be newtail
                newTail.next=null;
                tail=newTail;
                size--;
            }
        }

        void removeFirst(){
            if(size==0){
                System.out.println("List is empty");
            }else if(size==1){
                head=tail=null;
                size--;
            }else{
                Node newHead=head.next;
                head.next=null;
                head=newHead;
                size--;
            }
        }

        void removeAt(int idx){
            if(size==0){
                System.out.println("list is empty");
            }
            else if(idx==0){
                removeFirst();
            }else if(idx==size){
                removeLast();
            }else if(idx<0||idx>size){
                System.out.println("invalid arguments");
            }else{
                Node targetNode=getNodeAt(idx-1);
                targetNode.next=targetNode.next.next;
                size--;
            }
        }

        int getFirst(){
            if(size==0){
                System.out.println("list is empty");
                return -1;
            }else{
                return head.data;
            }
        }

        int getLast(){
            if(size==0){
                System.out.println("list is empty");
                return -1;
            }else{
                return tail.data;
            }
        }

        int getAt(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        MyLinkedList ll=new MyLinkedList();

        ll.addLast(30);
        ll.addFirst(10);
        ll.addLast(40);
        ll.addLast(5);
        ll.addLast(1);
        ll.addLast(8);
        ll.display();
        ll.addAt(3, 2);

        ll.removeFirst();
        ll.removeLast();
        ll.removeAt(3);

        ll.display();

    }
}
