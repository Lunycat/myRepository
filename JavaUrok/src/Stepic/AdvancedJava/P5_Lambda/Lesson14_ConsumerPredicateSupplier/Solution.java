package Stepic.AdvancedJava.P5_Lambda.Lesson14_ConsumerPredicateSupplier;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.length());
        consumer.accept("aaaaa");

        Supplier<Car> supplier = () -> new Car("Чёрный", "Мерседес");
        Car car = supplier.get();
        System.out.println(car);

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