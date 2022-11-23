package Stepic.AdvancedJava.MyPractic;

public class Runner {
    public static void main(String[] args) {
        MyStack stack = new MyStack(6);
        System.out.println(stack.push(5));
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));
        System.out.println(stack.push(4));
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
