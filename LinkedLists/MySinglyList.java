public class MySinglyList {
    
    int length;
    Node head;

    class Node{
        int val;
        Node next;
        Node (int val){
            this.val=val;
        }
    }

    public MySinglyList(){
        this.length=0;
        this.head=null;
    }

    public int get(int index){
        if(index<0||index>=this.length){
            return -1;
        }
        else{
            int counter=0;
            Node curr=head;
            while(counter!=index){
                curr=curr.next;
                counter++;
            }

            return curr.val;
        }
    }

    public void addAtHead(int val){
        Node newNode=new Node(val);
        newNode.next=this.head;
        this.head=newNode;
        this.length++;
    }

    public void addAtTail(int val){
        if(this.length==0){
            addAtHead(val);
        }
        else{
            Node newNode=new Node(val);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
            this.length++;
        }
    }

    //Add a node of value val before the index-th node in the linked list
    public void addAtIndex(int index,int val){
        Node newNode=new Node(val);
        Node temp=head;

        int counter=0;
        if(index==this.length){
            addAtTail(val);
            return;
        }
        else if(index>this.length){
            return;
        }
        else if(index==0){
            addAtHead(val);
            return;
        }

        while(counter!=index-1){
            temp=temp.next;
            counter++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        this.length++;
    }
    
    public void deleteAtIndex(int index){
        if(index<0||index>=this.length){
            return;
        }
        Node curr=head;
        if(index==0){
            head=curr.next;
        }
        else{
            Node current=head;
            Node pre=null;
            int counter=0;
            while(counter!=index){
                pre=current;
                current=current.next;
                counter++;
            }
            pre.next=current.next;
            this.length--;
        }
    }
    
    public static void main(String[] args) {
        MySinglyList obj=new MySinglyList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1,2);
        System.out.println(obj.get(1));
        obj.deleteAtIndex(1);
        System.out.println(obj.get(1));
    }
}
