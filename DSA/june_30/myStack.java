package DSA.june_30;

class Stack {
    private int[] stack;
    private int top;
    private int maxSize;

    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1; // stack is initially empty
    }

    // Push operation
    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push: " + value);
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value + " to stack.");
        }
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            int value = stack[top--];
            System.out.println("Popped " + value + " from stack.");
            return value;
        }
    }

    // Top operation
    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    // Peep operation
    public int peep(int position) {
        // position = 1 means top, 2 is one below top, and so on
        int index = top - position + 1;
        if (index < 0 || index > top) {
            System.out.println("Invalid position: " + position);
            return -1;
        }
        return stack[index];
    }

    // Display current stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class myStack {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        System.out.println("Top element: " + s.top());
        System.out.println("Peep at position 2: " + s.peep(2));

        s.pop();
        s.display();
    }
}
