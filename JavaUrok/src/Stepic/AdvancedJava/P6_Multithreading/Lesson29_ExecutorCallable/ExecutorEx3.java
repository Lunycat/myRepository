package Stepic.AdvancedJava.P6_Multithreading.Lesson29_ExecutorCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorEx3 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(6);
        List<Future<Integer>> result = new ArrayList<>();
        int sum = 0;

        result.add(es.submit(new MyCallableInteger()));
        result.add(es.submit(new MyCallableInteger()));
        result.add(es.submit(new MyCallableInteger()));
        result.add(es.submit(new MyCallableInteger()));
        result.add(es.submit(new MyCallableInteger()));
        result.add(es.submit(new MyCallableInteger()));
        for (Future<Integer> future : result) {
            try {
                sum += future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        es.shutdown();
        System.out.println(sum);
    }
}

class MyCallableInteger implements Callable<Integer> {
    @Override
    public Integer call() {
        int i = 0;
        for (; i < (int) (Math.random() * 100); i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.printf("Значение %s = %d\n", Thread.currentThread().getName(), i);
        return i;
    }
}