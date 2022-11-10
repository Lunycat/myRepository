package Stepic.AdvancedJava.P5_Stream.Lesson19_FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    public static void main(String[] args) {
        List<Human> humans1 = Human.initList1();
        List<Human> humans2 = Human.initList2();
        List<List<Human>> humansOfListHumans= new ArrayList<>(List.of(humans1, humans2));

        List<String> humanNames = humansOfListHumans.stream()
                .flatMap(h -> h.stream())
                .map(h -> h.name)
                .collect(Collectors.toList());
        humanNames.forEach(System.out::println);
    }
}

class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    static List<Human> initList1() {
        Human human1 = new Human("Егор", 21);
        Human human2 = new Human("Антон", 16);
        Human human3 = new Human("Сергей", 23);
        Human human4 = new Human("Владимир", 26);
        return new ArrayList<>(List.of(human1, human2, human3, human4));
    }

    static List<Human> initList2() {
        Human human5 = new Human("Виталик", 18);
        Human human6 = new Human("Евгений", 21);
        return new ArrayList<>(List.of(human5, human6));
    }
}