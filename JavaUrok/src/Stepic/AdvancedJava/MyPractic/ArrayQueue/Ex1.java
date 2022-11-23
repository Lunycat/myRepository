package Stepic.AdvancedJava.MyPractic.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Ex1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(2);
        queue.offer(3);
        queue.offer(7);
        queue.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
        queue.poll();
        queue.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
        queue.poll();
        queue.forEach(integer -> System.out.print(integer + " "));
    }
}
