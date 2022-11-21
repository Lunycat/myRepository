package Stepic.AdvancedJava.P6_Multithreading.Lesson33_Exchanger;

import Stepic.JavaForBeginners.Lesson10.p1.p4.p5.E;

import java.util.Random;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangerEx1 {
    static final Exchanger<String> EXCHANGER = new Exchanger<>();

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new Truck(1, 'A', 'D', new String[]{"[Посылка A->D]", "[Посылка A->C]"}));
        es.execute(new Truck(2, 'B', 'C', new String[]{"[Посылка B->C]", "[Посылка B->D]"}));
        es.shutdown();
    }
}

class Truck implements Runnable {
    private int number;
    private char from;
    private char to;
    private String[] parcels;

    public Truck(int number, char from, char to, String[] parcels) {
        this.number = number;
        this.from = from;
        this.to = to;
        this.parcels = parcels;
    }

    @Override
    public void run() {
        Random r = new Random();
        try {
            System.out.printf("Грузовик №%d загрузили %s и %s\n", number, parcels[0], parcels[1]);
            Thread.sleep(r.nextInt(3000, 6000));
            System.out.printf("Грузовик №%d выехал из точки %s в точку %s\n", number, from, to);
            Thread.sleep(r.nextInt(3000, 6000));
            System.out.printf("Грузовик №%d приехал в точку E\n", number);
            parcels[1] = ExchangerEx1.EXCHANGER.exchange(parcels[1]);
            System.out.printf("Грузовик №%d поехал дальше\n", number);
            Thread.sleep(r.nextInt(3000, 6000));
            System.out.printf("Грузовик №%d приехал в точку %s и привёз посылки %s и %s\n", number, to, parcels[0], parcels[1]);
        } catch (InterruptedException e) {}
    }
}