package Stepic.AdvancedJava.P5_Stream.Lesson20_Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapForAge {
    public static void main(String[] args) {
        Human h1 = new Human("Костя", 21);
        Human h2 = new Human("Аня", 21);
        Human h3 = new Human("Петя", 26);
        Human h4 = new Human("Света", 46);
        Human h5 = new Human("Коля", 32);
        Human h6 = new Human("Сергей", 46);
        Human h7 = new Human("Егор", 32);
        Human h8 = new Human("Евгений", 26);
        Human h9 = new Human("Анастасия", 28);
        Human h10 = new Human("Дима", 22);
        List<Human> humans = new ArrayList<>(List.of(h1, h2, h3, h4, h5, h6, h7, h8, h9, h10));

        Map<Integer, List<Human>> humansMap = humans.stream().collect(Collectors.groupingBy(h -> h.age));
        humansMap.forEach((k,v) -> System.out.println(k + ": " + v));

        Map<Boolean, List<Human>> humanAge = humans.stream()
                .collect(Collectors.partitioningBy(h -> h.age > 30));
        humanAge.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}

class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}