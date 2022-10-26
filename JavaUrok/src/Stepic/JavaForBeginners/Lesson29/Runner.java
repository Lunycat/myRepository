package Stepic.JavaForBeginners.Lesson29;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Speakable> speakables = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();

        Animal animalSwordFish = new Swordfish("Меченосец типа Animal");
        Animal animalPenguin = new Penguin("Пингвин типа Animal");
        Animal animalLev = new Lev("Лев типа Animal");

        Fish fishSwordfish = new Swordfish("Меченосец типа Fish");
        Swordfish swordfish = new Swordfish("Меченосец своего типа");

        Bird birdPenguin = new Penguin("Пингвин типа Bird");
        Penguin penguin = new Penguin("Пингвин своего типа");

        Mammal mammalLev = new Lev("Лев типа Mammal");
        Lev lev = new Lev("Лев своего типа");

        Speakable speakablePenguin = new Penguin("Пингвин типа Speakable");
        Speakable speakableLev = new Lev("Лев типа Speakable");

        speakables.add(speakableLev);
        speakables.add(speakablePenguin);
        speakables.add(birdPenguin);
        speakables.add(penguin);
        speakables.add(mammalLev);
        speakables.add(lev);

        animals.add(animalLev);
        animals.add(animalPenguin);
        animals.add(animalSwordFish);
        animals.add(fishSwordfish);
        animals.add(swordfish);
        animals.add(birdPenguin);
        animals.add(penguin);
        animals.add(mammalLev);
        animals.add(lev);

        for (Animal animal : animals) {
            switch (animal) {
                case Swordfish s -> {
                    System.out.println(s.name);
                    s.eat();
                    s.sleep();
                    s.swim();
                    System.out.println();
                } case Penguin p -> {
                    System.out.println(p.name);
                    p.eat();
                    p.sleep();
                    p.speak();
                    p.fly();
                    System.out.println();
                } case Lev l -> {
                    System.out.println(l.name);
                    l.eat();
                    l.sleep();
                    l.speak();
                    l.run();
                    System.out.println();
                }
                default -> System.out.println("Каво?");
            }
        }

        for (Speakable animal : speakables) {
            if (animal instanceof Swordfish s) {
                System.out.println(s.name);
                s.eat();
                s.sleep();
                s.swim();
                System.out.println();
            } else if (animal instanceof Penguin p) {
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.speak();
                p.fly();
                System.out.println();
            } else if (animal instanceof Lev l) {
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.speak();
                l.run();
                System.out.println();
            }
        }
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

class Swordfish extends Fish {
        Swordfish(String name) {
            super(name);
        }

        @Override
        void swim() {
            System.out.println(name + " красивая рыба, которая быстро плавает");
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
            System.out.println(name + " не умеет летать!");
        }

        @Override
        void eat() {
            System.out.println(name + " ест рыбу");
        }

        @Override
        void sleep() {
            System.out.println(name + " спит");
        }

        @Override
        public void speak() {
            System.out.println(name + " не поёт");
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
            System.out.println("Большую часть дня " + name + " спит");
        }

        @Override
        void run() {
            System.out.println(name + " самая быстрая кошка!");
        }
    }

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}