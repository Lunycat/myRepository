package Stepic.AdvancedJava.P5_Lambda.Lesson14_ConsumerPredicateSupplier;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {
        Car car1 = new Car("Зелёный", "Лада");
        Consumer<Car> consumer = car -> {
            System.out.println("Цвет машины до изменения: "+ car.color);
            car.color = "Красный";
            System.out.println("Цвет машины после изменения: "+ car.color);
        };
        consumer.accept(car1);
        System.out.println(car1.color);

        Supplier<Car> supplier = () -> new Car("Чёрный", "Мерседес");
        Car car2 = supplier.get();
        System.out.println(car2);

        Predicate<Integer> predicate = number -> number>10;
        System.out.println(predicate.test(12));
    }
}

class Car{
    String color;
    String model;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}