package DSA.july_2;

import java.util.*;

public class stack_using_queue {
    Queue<Integer> a;
    Queue<Integer> b;

    public stack_using_queue() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void push(int x) {
        b.offer(x);
        while (!a.isEmpty()) {
            b.offer(a.poll());
        }
        Queue<Integer> temp = a;
        a = b;
        b = temp;
    }

    public int pop() {
        return a.poll();
    }

    public int top() {
        return a.peek(); t
    }

    public boolean empty() {
        return a.isEmpty();
    }
}
