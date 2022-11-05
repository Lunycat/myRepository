package Stepic.AdvancedJava.P1_ComparableAndComparator.Lesson1;

import java.util.ArrayList;
import java.util.Collections;

public class MyComparable {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();

        Human human1 = new Human("Женя", "Спицин", 25);
        Human human2 = new Human("Вася", "Пупкин", 36);
        Human human3 = new Human("Артём", "Синицин", 32);
        Human human4 = new Human("Артём", "Якубович", 25);
        Human human5 = new Human("Вася", "Лутков", 40);

        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.add(human5);

        System.out.println("До сортировки:");
        humans.forEach(human -> System.out.println("Имя: " + human.name +
                    ". Фамилия: " + human.surname + ". Возраст: " + human.age));

        Collections.sort(humans);

        System.out.println("После сортировки:");
        humans.forEach(human -> System.out.println("Имя: " + human.name +
                ". Фамилия: " + human.surname + ". Возраст: " + human.age));
    }
}

class Human implements Comparable<Human> {
    String name;
    String surname;
    int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Human o) {
        int res = this.name.compareTo(o.name);
        if (res == 0)
            res = this.surname.compareTo(o.surname);
        return res;
    }
}