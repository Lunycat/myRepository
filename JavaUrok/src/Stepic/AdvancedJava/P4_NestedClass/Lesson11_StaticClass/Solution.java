package Stepic.AdvancedJava.P4_NestedClass.Lesson11_StaticClass;

public class Solution {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(200);
        Car car = new Car("Зелёная", 4, engine);
        System.out.println(car);
    }
}

class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
}