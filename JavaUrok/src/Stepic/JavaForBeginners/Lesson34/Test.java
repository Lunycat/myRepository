package Stepic.JavaForBeginners.Lesson34;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        Human h1 = new Human("Ванёк", 34);
        Human h2 = new Human("Женёк", 26);
        Human h3 = new Human("Серёга", 27);
        Human h4 = new Human("Саша", 65);

        humans.add(h1);
        humans.add(h2);
        humans.add(h3);
        humans.add(h4);

        Human.printFilter(humans, h -> h.age > 30);
        System.out.println("-----------------------------------------------");
        Human.printFilter(humans, h -> h.name.startsWith("С"));
    }
}

class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void printFilter(ArrayList<Human> humans, Predicate<Human> predicate) {
        for (Human h : humans) {
            if (predicate.test(h)) {
                System.out.println("Имя: " + h.name + ". Возраст: " + h.age);
            }
        }
    }
}