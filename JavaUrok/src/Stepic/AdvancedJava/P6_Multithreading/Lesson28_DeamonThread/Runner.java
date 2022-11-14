package Stepic.AdvancedJava.P6_Multithreading.Lesson28_DeamonThread;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        Thread1 thread3 = new Thread1();
        Thread.sleep(200);

    }
}

class Thread1 extends Thread {
    public Thread1() {
        this.setDaemon(true);
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(getName() + " " + i);
        }
    }
}