import java.util.Scanner;

public class _1ReverseLL {
    public static class Node {
        int val;
        Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            // preserve
            Node next = curr.next;

            // work
            curr.next = prev;

            // move
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Node dummy = new Node(-1);
        Node prev = dummy;
        while (n > 0) {
            prev.next = new Node(scn.nextInt());
            prev = prev.next;
            n--;
        }

        Node head = reverse(dummy.next);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
