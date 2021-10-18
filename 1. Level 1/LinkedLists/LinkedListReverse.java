public class LinkedListReverse {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val) {
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;

            if (size == 0) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public void addFirst(int val) {
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

        public Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void display() {
            Node temp = this.head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Tc- O(n^2)
        public void reverseDataIterative() {
            int left = 0;
            int right = size - 1;

            Node leftNode = head;
            while (left < right) {
                Node rightNode = getNodeAt(right);

                int temp = leftNode.data;
                leftNode.data = rightNode.data;
                rightNode.data = temp;

                leftNode = leftNode.next;

                left++;
                right--;
            }

        }

        // Best approach ReversePointer Iterative
        public void reversePointerIterative() {
            Node prev=null;
            Node curr=head;

            while(curr!=null){
                Node next=curr.next;

                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node temp=head;
            head=prev;
            tail=temp;

        }

        public void reverseDataRecursive() {
            reverseDataRecursiveHelper(head, 1);
        }

        private Node reverseDataRecursiveHelper(Node rightNode, int level) {
            if (rightNode == null) {
                return head;
            }

            Node leftNode = reverseDataRecursiveHelper(rightNode.next, level + 1);

            if (level > size / 2) {
                int temp = leftNode.data;
                leftNode.data = rightNode.data;
                rightNode.data = temp;
            } else {

            }

            return leftNode.next;
        }

    }

    public static void main(String[] args) {
        LinkedList lr = new LinkedList();

        lr.addLast(10);
        lr.addLast(20);
        lr.addLast(30);
        lr.addLast(40);
        lr.addLast(50);
        lr.display();
        // lr.reverseDataIterative();
        // lr.reversePointerIterative();
        lr.reverseDataRecursive();
        lr.display();
    }
}