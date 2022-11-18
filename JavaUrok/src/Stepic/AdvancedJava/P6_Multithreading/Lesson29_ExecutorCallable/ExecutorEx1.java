package Stepic.AdvancedJava.P6_Multithreading.Lesson29_ExecutorCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorEx1 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        es.shutdown();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < (int) (Math.random() * 100); i++) {
            System.out.println(Thread.currentThread().getName() + " работает значение i = " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " закончил работу");
    }
}