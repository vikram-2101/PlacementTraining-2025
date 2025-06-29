package DSA.june_27;

public class DesignBrowser {
    Node head;
    Node tail;
    Node curr;

    public DesignBrowser(String homepage) {
        head = new Node(homepage);
        curr = head;
    }

    public void visit(String url) {
        Node temp = new Node(url);
        if (curr.next != null) {
            curr.next.prev = null;
        }
        curr.next = temp;
        temp.prev = curr;
        curr = curr.next;
        tail = curr;
    }

    public String back(int steps) {
        int i = 0;

        while (i < steps && curr.prev != null) {
            // System.out.println(curr.val);
            curr = curr.prev;
            i++;
        }
        // System.out.println(curr.val);
        if (curr == null) {
            curr = head;
            return head.val;
        } // System.out.println(curr.val);
        return curr.val;
    }

    public String forward(int steps) {
        int i = 0;
        // System.out.println(curr.val);
        while (i < steps && curr.next != null) {
            curr = curr.next;
            i++;
        }
        if (curr == null) {
            curr = tail;
            System.out.println(curr.val);
            return tail.val;
        } // System.out.println(curr.val);
        return curr.val;
    }

    private class Node {
        String val;
        Node prev;
        Node next;

        private Node(String val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }
}
