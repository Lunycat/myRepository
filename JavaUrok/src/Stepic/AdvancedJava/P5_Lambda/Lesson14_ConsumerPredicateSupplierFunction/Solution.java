package Stepic.AdvancedJava.P5_Lambda.Lesson14_ConsumerPredicateSupplierFunction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {
        Car car1 = new Car("Зелёный", "Лада", 800);
        Consumer<Car> consumer = car -> {
            System.out.println("Цвет машины до изменения: "+ car.color);
            car.color = "Красный";
            System.out.println("Цвет машины после изменения: "+ car.color);
        };
        consumer.accept(car1);
        System.out.println(car1.color);

        Supplier<Car> supplier = () -> new Car("Чёрный", "Мерседес", 800);
        Car car2 = supplier.get();
        System.out.println(car2);

        Predicate<Integer> predicate = number -> number>10;
        System.out.println(predicate.test(12));

        Function<Car, Integer> function = car -> {
            System.out.println("Мощность была: "+ car.horsePower+". А теперь: "+ (car.horsePower+50));
            return 50;
        };

        System.out.println();
        car2.horsePower += function.apply(car2);
        System.out.println(car2);
    }
}

class Car{
    String color;
    String model;
    int horsePower;

    public Car(String color, String model, int horsePower) {
        this.color = color;
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}