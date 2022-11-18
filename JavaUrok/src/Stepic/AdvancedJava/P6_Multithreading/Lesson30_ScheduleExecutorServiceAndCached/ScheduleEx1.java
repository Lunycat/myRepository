package Stepic.AdvancedJava.P6_Multithreading.Lesson30_ScheduleExecutorServiceAndCached;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleEx1 {
    public static void main(String[] args) {
        ScheduledExecutorService sh = Executors.newScheduledThreadPool(1);
        sh.schedule(new MyRunnable(), 3, TimeUnit.SECONDS);
        sh.shutdown();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" начал работу");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" закончил работу");
    }
}