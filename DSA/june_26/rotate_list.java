package DSA.june_26;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class rotate_list {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        if (k == 0)
            return head;
        int n = 1;
        ListNode temp = head;
        while (temp.next != null) {
            n++;
            temp = temp.next;
        }
        k = k % n;
        temp.next = head;
        temp = head;
        for (int i = 1; i < n - k; i++) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
