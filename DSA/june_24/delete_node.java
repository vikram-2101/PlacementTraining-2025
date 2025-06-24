package DSA.june_24;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class delete_node {
    public static void main(String[] args) {

    }

    class Solution {
        Node deleteNode(Node head, int x) {
            // code here
            if (x == 1)
                return head.next;
            Node temp = head;
            x--;
            while (x > 1) {
                x--;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return head;
        }
    }
}
