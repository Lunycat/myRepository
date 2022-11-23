package Stepic.AdvancedJava.P6_Multithreading.Lesson36_ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Ex1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> list = new ArrayBlockingQueue<>(4);
        new Thread(() -> {
            try {
                int i = 0;
                while (true) {
                    Thread.sleep(2000);
                    list.put(++i);
                    System.out.println("Производитель добавил: " + i);
                    System.out.println(list);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(4000);
                    System.out.println("Потребитель забрал: " + list.take());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
