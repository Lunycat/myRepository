package StepicJavaForBeginners.PrimitiveAndReference_1_11;


public class Car {
    String color;
    String engine;
    int countDoors;

    public Car(String color, String engine, int countDoors) {
        this.color = color;
        this.engine = engine;
        this.countDoors = countDoors;
    }

    void changeDoors(int count) {
        this.countDoors = count;
    }

    static void changeColor(Car car1, Car car2) {
        String tmp = car1.color;
        car1.color = car2.color;
        car2.color = tmp;
    }
}
