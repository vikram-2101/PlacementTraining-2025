package DSA.july_1;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public void enqueue(int item) {
        list.addLast(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.removeFirst();
    }

    public int front() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void printQueue() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.front()); // 10
        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Size: " + queue.size()); // 2
        System.out.println("Is Empty: " + queue.isEmpty()); // false

        queue.printQueue(); // [20, 30]
    }
}
