package DSA.july_1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class oddEvenLinkedlist {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        int count = 1;
        ListNode temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        ListNode evenHead = new ListNode(-1);
        ListNode oddHead = new ListNode(-1);
        ListNode oddTail = oddHead;
        ListNode evenTail = evenHead;
        for (int i = 1; i <= count; i++) {
            ListNode nextNode = temp.next; // Store next node before breaking the link
            temp.next = null; // Break the link to avoid cycles

            if (i % 2 != 0) { // Odd index
                oddTail.next = temp;
                oddTail = temp;
            } else { // Even index
                evenTail.next = temp;
                evenTail = temp;
            }

            temp = nextNode; // Move to the next node
        }

        // Merge odd and even lists
        oddTail.next = evenHead.next;
        return oddHead.next;
    }
}
