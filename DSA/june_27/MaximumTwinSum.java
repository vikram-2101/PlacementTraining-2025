package DSA.june_27;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MaximumTwinSum {
    public static void main(String[] args) {

    }

    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        int ans = Integer.MIN_VALUE;
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            int sum = first.val + second.val;
            ans = Math.max(ans, sum);
            first = first.next;
            second = second.next;
        }
        return ans;
    }
}
