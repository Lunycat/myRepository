package Stepic.AdvancedJava.P6_Multithreading.Lesson30_ScheduleExecutorServiceAndCached;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleEx3 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService sh = Executors.newScheduledThreadPool(1);
        /* Ждёт 4 секунды до начала потока, потом
        ждёт 2 секунды после начала старого потока и началом нового */
        sh.scheduleAtFixedRate(new MyRunnable(), 4, 2, TimeUnit.SECONDS);


        Thread.sleep(20000);
        sh.shutdown();
        sh.awaitTermination(1, TimeUnit.DAYS);

        System.out.println("Метод main закончил работу");
    }
}
