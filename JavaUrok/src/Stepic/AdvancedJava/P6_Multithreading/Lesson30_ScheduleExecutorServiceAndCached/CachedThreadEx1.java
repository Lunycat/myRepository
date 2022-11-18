package Stepic.AdvancedJava.P6_Multithreading.Lesson30_ScheduleExecutorServiceAndCached;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadEx1 {
    public static void main(String[] args) throws InterruptedException {
        // Создаёт новые потоки если такие требуются. Если пройдёт 1 минута, а поток не используется, то он удаляется
        ExecutorService cached = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            cached.execute(new MyRunnable());
            Thread.sleep(300);
        }
        cached.shutdown();
    }
}
