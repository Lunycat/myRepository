package Stepic.AdvancedJava.P6_Multithreading.Lesson34_WrapperSynch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Synch {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> source = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        Runnable r = () -> synchronizedList.addAll(source);
        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();

        System.out.println(synchronizedList);
    }
}
