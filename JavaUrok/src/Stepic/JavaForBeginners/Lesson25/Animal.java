package Stepic.JavaForBeginners.Lesson25;

public class Animal {
    int eyes;

    Animal() {
        System.out.println("I am animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    final int tail = 1;
    final int paw = 4;

    Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jump");
    }
}

class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }

    @Override
    void eat() {
        System.out.println("Dog eats");
    }
}

class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }

    @Override
    void eat() {
        System.out.println("Cat eats");
    }
}

class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Рекс");
        System.out.println("У Рекса " + dog.paw + " лапы");
        dog.eat();

        System.out.println();

        Cat cat = new Cat("Евгений");
        cat.sleep();
        cat.eat();
    }
}
