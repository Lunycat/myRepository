package Stepic.AdvancedJava.MyPractic.MyStackAndMyQueue;

public class Runner {
    public static void main(String[] args) {
/*      MyStack stack = new MyStack(6);
        System.out.println(stack.push(5));
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));
        System.out.println(stack.push(4));
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.print();
        stack.push(8);
        stack.push(10);
        stack.print();
        stack.pop();
        stack.print();
        System.out.println("----------------------------------"); */
        MyQueue queue = new MyQueue(6);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.print();
        System.out.println(queue.poll());
        queue.offer(6);
        queue.poll();
        queue.offer(7);
        queue.poll();
        queue.print();

    }
}
