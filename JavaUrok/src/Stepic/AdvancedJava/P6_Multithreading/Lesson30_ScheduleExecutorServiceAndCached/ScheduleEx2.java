package Stepic.AdvancedJava.P6_Multithreading.Lesson30_ScheduleExecutorServiceAndCached;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleEx2 {
    public static void main(String[] args) throws InterruptedException{
        ScheduledExecutorService sh = Executors.newScheduledThreadPool(1);
        /* Ждёт 4 секунды до начала потока, потом
        ждёт 3 секунды после окончания старого потока и началом нового */
        sh.scheduleWithFixedDelay(new MyRunnable(), 4, 3, TimeUnit.SECONDS);

        Thread.sleep(20000);
        sh.shutdown();
        sh.awaitTermination(30000, TimeUnit.SECONDS);

        System.out.println("Метод main закончил работу");
    }
}
