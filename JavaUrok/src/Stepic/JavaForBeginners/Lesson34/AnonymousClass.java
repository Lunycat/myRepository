package Stepic.JavaForBeginners.Lesson34;

public class AnonymousClass {
    public static void main(String[] args) {
        Animal animal = () -> "Животное ест";

        System.out.println(animal.eat());
        System.out.println(animal.getClass().getSimpleName() + "\n");

        Animal1 animal1 = new Animal1() {

        };
        System.out.println(animal1.getClass().getName() + "\n");

        Animal1 animal2 = new Animal1();
        System.out.println(animal2.getClass().getSimpleName());
    }
}

interface Animal {
    String eat();
}

class Animal1 {

}