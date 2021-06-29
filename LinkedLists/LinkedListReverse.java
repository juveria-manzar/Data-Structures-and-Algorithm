public class LinkedListReverse {

    public class Node {
        int data;
        Node next;
    }

    public class LinkedList {
        Node head;
        Node tail;
        int size;

        void addFirst(int val) {
            Node newNode = new Node();
            newNode.data = val;

            if (size == 0) {
                this.head = this.tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        void display() {
            Node temp = this.head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        //Tc- O(n^2)
        void reverseDataIterative() {
            int left = 0;
            int right = size - 1;

            Node lowNode = head;
            while (left < right) {
                Node righNode = getNodeAt(right);

                int temp=lowNode.data;
                lowNode.data=righNode.data;
                righNode.data=temp;

                lowNode=lowNode.next;
                left++;
                right--;
            }
        }

        void reversePointerIterative(){
            
        }
    }

    public static void main(String[] args) {
        LinkedListReverse lr=new Linke
    }
}
