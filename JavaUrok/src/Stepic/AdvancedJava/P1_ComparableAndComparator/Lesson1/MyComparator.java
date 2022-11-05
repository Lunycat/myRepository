package Stepic.AdvancedJava.P1_ComparableAndComparator.Lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator {
    public static void main(String[] args) {
        ArrayList<Car> cars = arrayInit();

        cars.forEach(car -> System.out.println("Цвет: " + car.color + ". Двигатель: "
                + car.engine + ". Мощность " + car.powerEngine));
        System.out.println("------------------------------------------------");

        Collections.sort(cars, new ColorComparator());

        cars.forEach(car -> System.out.println("Цвет: " + car.color + ". Двигатель: "
                + car.engine + ". Мощность " + car.powerEngine));


    }

    static ArrayList<Car> arrayInit() {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("Жёлтый", "V8", 800);
        Car car2 = new Car("Красный", "V9", 900);
        Car car3 = new Car("Жёлтый", "V10", 1000);
        Car car4 = new Car("Зелёный", "V7", 700);
        Car car5 = new Car("Белый", "V8", 850);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars;
    }
}

class Car {
    String color;
    String engine;
    int powerEngine;

    Car(String color, String engine, int powerEngine) {
        this.color = color;
        this.engine = engine;
        this.powerEngine = powerEngine;
    }
}

class ColorComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        int res = car1.color.compareTo(car2.color);
        if (res == 0)
            res = car1.engine.compareTo(car2.engine);
        return res;
    }
}