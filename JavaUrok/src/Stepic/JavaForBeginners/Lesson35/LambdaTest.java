package Stepic.JavaForBeginners.Lesson35;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest {
    public static void main(String[] args) {
        ArrayList<Human> humans = Human.createHumansArray(() -> new Human("Чел ты", 30));
        for (Human h : humans) {
            System.out.println(h.name);
        }
        System.out.println();

        Predicate<Human> isName = human -> human.name.equals("Олег");
        Supplier<Human> getHuman = () -> new Human("Евгений", 40);
        Consumer<Human> setNameAndPrint = human ->
        {
            human.name = "Егор";
            System.out.println("Теперь его имя: " + human.name);
        };

        Human human1 = new Human("Олег", 35);
        Human human2 = getHuman.get();

        System.out.println(isName.test(human1));
        System.out.println("Имя: " + human2.name + ". Возраст: " + human2.age);
        setNameAndPrint.accept(human2);
    }
}

class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static ArrayList<Human> createHumansArray(Supplier<Human> s) {
        ArrayList<Human> humans = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            humans.add(s.get());
        }
        return humans;
    }
}