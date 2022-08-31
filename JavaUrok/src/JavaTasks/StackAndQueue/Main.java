package JavaTasks.StackAndQueue;

import java.util.Stack;

public class Main {
    public void Stack() {
        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
            System.out.println(stack.push(i));
        }
    }
}
