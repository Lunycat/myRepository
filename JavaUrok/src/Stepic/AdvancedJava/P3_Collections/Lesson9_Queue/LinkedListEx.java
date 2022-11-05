package Stepic.AdvancedJava.P3_Collections.Lesson9_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<>();

        linkedList.offer("Артём");
        linkedList.offer("Евгений");
        linkedList.offer("Сергей");
        linkedList.offer("Егор");
        linkedList.offer("Дима");

        System.out.println(linkedList);
        System.out.println(linkedList.remove());
        System.out.println(linkedList + "\n");

        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll() + "\n");

        System.out.println(linkedList.peek());
        System.out.println(linkedList);
    }
}
