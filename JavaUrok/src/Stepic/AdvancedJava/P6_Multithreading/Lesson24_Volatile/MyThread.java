package Stepic.AdvancedJava.P6_Multithreading.Lesson24_Volatile;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            increment();
        }
    }

    static void increment() {
        synchronized (MyThread.class) {
            Counter.count++;
            System.out.println(currentThread().getName() + " " + Counter.count);
        }
    }
}

class Counter {
    static volatile int count = 0;
}

class Runner {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}