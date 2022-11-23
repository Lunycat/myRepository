package Stepic.AdvancedJava.MyPractic.MyStackAndMyQueue;

public class MyQueue {
    int[] queue;
    private int size;
    private int tail;

    public MyQueue(int size) {
        queue = new int[this.size = size];
    }

    public int offer(int element) {
        return queue[tail++] = element;
    }

    public int poll() {
        int element = queue[0];
        queue[0] = 0;
        for (int i = 0; i < size; i++) {
            if (queue[i+1] == 0)
                break;

            int tmp = queue[i];
            queue[i] = queue[i+1];
            queue[i+1] = tmp;
        }
        tail--;
        return element;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (queue[i + 1] == 0) {
                System.out.print(queue[i]);
                break;
            }
            System.out.print(queue[i]+", ");
        }
        System.out.println("]");
    }
}
