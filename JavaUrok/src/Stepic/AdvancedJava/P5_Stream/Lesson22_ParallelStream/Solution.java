package Stepic.AdvancedJava.P5_Stream.Lesson22_ParallelStream;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 100000000; i++) {
            integers.add(i);
        }

        long start = System.currentTimeMillis();
        int result = integers.parallelStream().reduce((a, i) -> a * i).get(); // Быстрее, чем просто .stream()
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}
