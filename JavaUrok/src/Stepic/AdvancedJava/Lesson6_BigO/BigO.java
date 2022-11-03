package Stepic.AdvancedJava.Lesson6_BigO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class BigO {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> linked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            array.add(random.nextInt(1, 61));
            linked.add(random.nextInt(1, 61));
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            array.add(linked.size()/2, i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнение заполнения array с начала: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linked.add(linked.size()/2, i);
        }
        finish = System.currentTimeMillis();
        System.out.println("Время выполнение заполнения linked с начала: " + (finish - start));
    }
}
