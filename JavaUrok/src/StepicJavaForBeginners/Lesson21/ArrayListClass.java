package StepicJavaForBeginners.Lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass{

    public static void main(String[] args) {
        ArrayList<String> list = abc("Б", "А", "Г", "В", "А", "В");
        System.out.println(list);
    }

    static ArrayList abc(String...str) {
        ArrayList<String> list = new ArrayList<>();

        for (String element : str) {
            if (!list.contains(element)) {
                list.add(element);
            }
        }

        Collections.sort(list);
        return list;
    }
}
