package Stepic.AdvancedJava.P6_Multithreading.Lesson23_JoinSleep;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.start();
        thread2.start();
        thread1.join(3000);
        System.out.println("Конец");
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        setName("Первый поток");

        for (int i = 1; i < 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + " " + i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        setName("Второй поток");
        for (int i = 10; i > 0; i--) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + " " + i);
        }
    }
}