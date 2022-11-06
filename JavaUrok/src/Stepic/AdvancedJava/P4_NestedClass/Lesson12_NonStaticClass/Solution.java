package Stepic.AdvancedJava.P4_NestedClass.Lesson12_NonStaticClass;

public class Solution {
    public static void main(String[] args) {
        Car car1 = new Car("Синий", "Мазда");
        Car.Engine engine = car1.new Engine("V10",600);

        System.out.println(engine);
        car1.setEngine(engine);
        System.out.println(car1 + "\n");

        Car car2 = new Car("Красный", "БМВ", "V12", 800);
        System.out.println(car1.getEngine().getModelEngine());
        System.out.println(car2.getModel());
    }
}

class Car {
    private String color;
    private String model;
    private Engine engine;

    public Car(String color, String model, String modelEngine, int horsePower) {
        this.color = color;
        this.model = model;
        this.engine = new Engine(modelEngine, horsePower);
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    class Engine {
        private String modelEngine;
        private int horsePower;

        public Engine(String modelEngine, int horsePower) {
            this.modelEngine = modelEngine;
            this.horsePower = horsePower;
        }

        public String getModelEngine() {
            return modelEngine;
        }

        public int getHorsePower() {
            return horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "modelEngine='" + modelEngine + '\'' +
                    ", horsePower=" + horsePower +
                    '}';
        }
    }
}