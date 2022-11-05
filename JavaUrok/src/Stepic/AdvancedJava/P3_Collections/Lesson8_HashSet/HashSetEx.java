package Stepic.AdvancedJava.P3_Collections.Lesson8_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(8);
        set2.add(9);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union);

        union.retainAll(set2);
        System.out.println(union);
    }
}
