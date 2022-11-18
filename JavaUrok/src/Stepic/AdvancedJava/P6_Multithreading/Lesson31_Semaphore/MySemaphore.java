package Stepic.AdvancedJava.P6_Multithreading.Lesson31_Semaphore;

import java.util.concurrent.Semaphore;

public class MySemaphore {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Данил", callBox);
        new Person("Сергей", callBox);
        new Person("Елена", callBox);
        new Person("Евгений", callBox);
        new Person("Мария", callBox);
        new Person("Анна", callBox);
    }
}

class Person extends Thread {
    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждёт своей очереди.");
            callBox.acquire();
            System.out.println(name + " разговаривает.");
            Thread.sleep(2000);
            System.out.println(name + " закончил(а) разговор.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}