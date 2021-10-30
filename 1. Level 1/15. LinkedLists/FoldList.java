public class FoldList {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        int size;
        Node head;
        Node tail;

        //CONCEPTUALLY GOOD
        Node lo;
        public void foldList() {
            lo = head;
            foldHelper(head, 0); // hi--level
        }

        public void foldHelper(Node hi, int level) {
            if (hi == null) {
                return;
            }

            foldHelper(hi.next, level + 1);

            if (level > size / 2) {
                // pointers in place swap
                Node lon = lo.next;
                lo.next = hi;
                hi = lon;
                lo = lon;
            } else if (level == size / 2) {
                // compute tail
                hi.next = null;
                tail = hi;
            } else {
                // do nothing
            }
        }
    }

    public static void main(String[] args) {
        //input can be managed
    }
}
