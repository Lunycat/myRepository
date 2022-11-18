package Stepic.AdvancedJava.P6_Multithreading.Lesson29_ExecutorCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorEx2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        List<Future<String>> result = new ArrayList<>();

        result.add(es.submit(new MyCallableString()));
        result.add(es.submit(new MyCallableString()));
        result.add(es.submit(new MyCallableString()));
        for (Future<String> future : result) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        es.shutdown();
    }
}

class MyCallableString implements Callable<String> {
    @Override
    public String call() {
        String nameThread = Thread.currentThread().getName();
        int i = 0;
        for (; i < (int) (Math.random() * 10); i++) {
            System.out.println(nameThread + " работает значение i = " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(nameThread + " закончил работу");
        return "Результат потока " + nameThread + " = " + i;
    }
}