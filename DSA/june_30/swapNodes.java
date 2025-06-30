package DSA.june_30;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class swapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        ListNode second = head;
        for (int i = 1; i < count - k + 1; i++) {
            second = second.next;
        }
        int ans = first.val;
        first.val = second.val;
        second.val = ans;
        return head;
    }
}
