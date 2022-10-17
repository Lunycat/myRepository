package StepicJavaForBeginners.Lesson27;

public class Runner {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Рыбёха");
        System.out.println(m.name);
        m.sleep();
        m.swim();
        m.eat();

        System.out.println();

        Speakable p = new Penguin("Пингвинчик");
        p.speak();

        System.out.println();

        Animal l1 = new Lev("Лефф");
        System.out.println(l1.name);
        l1.eat();
        l1.sleep();

        System.out.println();

        Mammal l2 = new Lev("Львович");
        System.out.println(l2.name);
        l2.eat();
        l2.sleep();
        l2.run();
        l2.speak();
    }
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("Мехеносек, красивая рыба, которая быстро плавает");
    }

    @Override
    void eat() {
        System.out.println(name + " не хищник, он есть корм");
    }
}

class Penguin extends Bird {
    Penguin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("Пингвин не умеет летать!");
    }

    @Override
    void eat() {
        System.out.println("Пинвины едят рыбу");
    }

    @Override
    void sleep() {
        System.out.println("Пингвин спит");
    }

    @Override
    public void speak() {
        System.out.println("Пингвин не поёт");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(name + " хищник, он есть мясо");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня " + name +  " спит");
    }

    @Override
    void run() {
        System.out.println(name + " самая быстрая кошка!");
    }
}