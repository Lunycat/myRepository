package Stepic.AdvancedJava.MyPractic.MyStackAndMyQueue;

public class MyStack {
    int[] stack;
    private int size;
    private int tail;

    public MyStack(int size) {
        this.stack = new int[this.size = size];
        tail = 0;
    }

    public int push(int element) {
        return stack[tail++] = element;
    }

    public int peek() {
        return stack[tail - 1];
    }

    public int pop() {
        int element = stack[tail-1];
        stack[tail-- -1] = 0;
        return element;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (stack[i + 1] == 0) {
                System.out.print(stack[i]);
                break;
            }
             System.out.print(stack[i]+", ");
        }
        System.out.println("]");
    }
}
