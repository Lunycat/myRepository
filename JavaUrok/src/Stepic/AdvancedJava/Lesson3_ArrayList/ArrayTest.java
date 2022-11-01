package Stepic.AdvancedJava.Lesson3_ArrayList;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Евгений");
        array.add("Артём");
        array.add("Заур");
        array.add("Саша");
        array.add("Дима");

        array.forEach(e -> System.out.println(e));

        String[] strings = array.toArray(new String[0]);

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("Артём");
        array2.add("Заур");

        array.removeIf(e -> e.contains("Артём"));
        System.out.println();
        array.forEach(e -> System.out.println(e));
    }
}
