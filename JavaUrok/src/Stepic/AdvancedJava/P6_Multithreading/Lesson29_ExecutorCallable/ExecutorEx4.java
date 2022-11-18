package Stepic.AdvancedJava.P6_Multithreading.Lesson29_ExecutorCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorEx4 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newWorkStealingPool();
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        es.execute(new MyRunnable());
        try {
            es.awaitTermination(300, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
