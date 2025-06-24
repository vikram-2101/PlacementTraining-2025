package DSA.june_24;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class find_middle {
    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while (second != null && second.next != null) {
            second = second.next.next;
            first = first.next;
        }
        return first;
    }
}