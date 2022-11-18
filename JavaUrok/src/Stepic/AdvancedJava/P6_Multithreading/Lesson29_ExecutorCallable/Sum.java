package Stepic.AdvancedJava.P6_Multithreading.Lesson29_ExecutorCallable;

import java.util.*;
import java.util.concurrent.*;

public class Sum {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int countThread = 10;
        long value = 1_000_000_000 / countThread;
        long totalSum = 0;
        ExecutorService es = Executors.newFixedThreadPool(countThread);
        List<Future<Long>> localResults = new ArrayList<>();

        for (int i = 0; i < countThread; i++) {
            long from = value * i + 1;
            long to = value * (i + 1);
            localResults.add(es.submit(new LocalSum(from, to)));
        }
        es.shutdown();

        for (Future<Long> f : localResults) {
            totalSum += f.get();
        }
        System.out.println("Итоговая сумма: " + totalSum);
    }
}

class LocalSum implements Callable<Long> {
    long localSum;
    long from;
    long to;

    public LocalSum(long from, long to) {
        this.from = from;
        this.to = to;
    }


    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.printf("%d + %d = %d\n", from, to, localSum);
        return localSum;
    }
}