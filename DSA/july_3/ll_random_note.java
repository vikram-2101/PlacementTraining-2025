package DSA.july_3;

import java.util.Random;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ll_random_note {
    private ListNode head;
    private Random rand;

    public ll_random_note(ListNode head) {
        this.head = head;
        this.rand = new Random();
    }

    public int getRandom() {
        int result = head.val;
        ListNode current = head.next;
        int i = 2;

        while (current != null) {
            // With probability 1/i, replace the result
            if (rand.nextInt(i) == 0) {
                result = current.val;
            }
            current = current.next;
            i++;
        }

        return result;
    }
}
