package Stepic.AdvancedJava.P6_Multithreading.Lesson35_ConcurrentHashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Ex1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Заур");
        map.put(2, "Евгений");
        map.put(3, "Саша");
        map.put(4, "Дима");
        map.put(5, "Настя");

        Thread thread1 = new Thread(() -> {
            Iterator<Integer> iter = map.keySet().iterator();
            while (iter.hasNext()) {
                try {
                    Thread.sleep(100);
                    int i = iter.next();
                    System.out.println(i + ":" + map.get(i));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(100);
                map.put(6, "Мария");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
        System.out.println(map);
    }
}
