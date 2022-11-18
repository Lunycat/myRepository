package Stepic.AdvancedJava.P6_Multithreading.Lesson30_ScheduleExecutorServiceAndCached;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleEx4 {
    public static void main(String[] args) {
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 10; i++) {
            schedule.schedule(new MyRunnable(), 3, TimeUnit.SECONDS);
        }
        schedule.shutdown();
    }
}
