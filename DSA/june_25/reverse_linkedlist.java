package DSA.june_25;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class reverse_linkedlist {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        while (present != null) {
            ListNode front = present.next;
            present.next = prev;
            prev = present;
            present = front;
        }
        return prev;
    }
}
