
public class AddTwoLists {

    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList {

        int size;
        Node head;
        Node tail;

        public void addFirst(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;

            if (size == 0) {
                tail = newNode;
            }
            size++;
        }

        public int addTwoListsHelper(Node node1, int pv1, Node node2, int pv2, LinkedList ans) {
            if (node1 == null && node2 == null) {
                return 0;
            }

            int sum = 0;
            if (pv1 == pv2) {
                int oc = addTwoListsHelper(node1.next, pv1 - 1, node2.next, pv2 - 1, ans);
                sum = oc + node1.data + node2.data;
            } else if (pv1 > pv2) {
                int oc = addTwoListsHelper(node1.next, pv1 - 1, node2, pv2, ans);
                sum = oc + node1.data;
            } else {
                int oc = addTwoListsHelper(node1, pv1, node2.next, pv2 - 1, ans);
                sum = oc + node2.data;
            }

            int val = sum % 10;
            int nc = sum / 10;
            ans.addFirst(val);
            return nc;

        }

        public LinkedList addTwoLists(LinkedList l1, LinkedList l2) {
            LinkedList ans = new LinkedList();
            int carry = addTwoListsHelper(l1.head, l1.size - 1, l2.head, l2.size - 1, ans);

            if (carry == 1) {
                ans.addFirst(1);
            }

            return ans;
        }

    }

    public static void main(String[] args) {
        // input can be managed
    }
}
