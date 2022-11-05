package Stepic.AdvancedJava.P3_Collections.Lesson10_Deque;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addFirst(4);
        arrayDeque.addLast(6);
        System.out.println(arrayDeque);
        arrayDeque.offerFirst(10);
        arrayDeque.offerLast(16);
        System.out.println(arrayDeque);
        arrayDeque.removeFirst();
        arrayDeque.pollLast();
        System.out.println(arrayDeque);


    }
}
