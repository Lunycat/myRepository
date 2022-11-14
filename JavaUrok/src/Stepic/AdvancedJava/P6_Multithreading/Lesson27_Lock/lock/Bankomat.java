package Stepic.AdvancedJava.P6_Multithreading.Lesson27_Lock.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Никита", lock);
        new Employee("Маша", lock);
        new Employee("Сергей", lock);
        new Employee("Марина", lock);
    }
}

class Employee extends Thread {
    private String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s ждёт\n", name);
            lock.lock();
            System.out.printf("%s пользуется банкоматом\n", name);
            sleep(5000);
            System.out.printf("%s завершил(а) пользоваться банкоматом\n", name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}