package Stepic.AdvancedJava.P6_Multithreading.Lesson32_CountDownLatch;

import java.util.concurrent.CountDownLatch;

class Runner {
    public static void main(String[] args) {
        MyCountDownLatch myCountDownLatch = new MyCountDownLatch();
        new Person("Марина", myCountDownLatch.countDownLatch);
        new Person("Маша", myCountDownLatch.countDownLatch);
        new Person("Алексей", myCountDownLatch.countDownLatch);
        new Person("Евгений", myCountDownLatch.countDownLatch);

        myCountDownLatch.marketStaffIsOnPlace();
        myCountDownLatch.marketIsReadyToOpen();
        myCountDownLatch.marketIsOpen();
    }
}

public class MyCountDownLatch {
    CountDownLatch countDownLatch = new CountDownLatch(3);

    void marketStaffIsOnPlace() {
        try {
            Thread.sleep(3000);
            System.out.println("Работники магазина пришли");
            countDownLatch.countDown();
            System.out.println("Осталось действий = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    void marketIsReadyToOpen() {
        try {
            Thread.sleep(4000);
            System.out.println("Магазин готов к открытию");
            countDownLatch.countDown();
            System.out.println("Осталось действий = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    void marketIsOpen() {
        try {
            Thread.sleep(2000);
            System.out.println("Магазин открыт");
            countDownLatch.countDown();
            System.out.println("Осталось действий = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Person extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public Person(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " приступает к закупкам");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}