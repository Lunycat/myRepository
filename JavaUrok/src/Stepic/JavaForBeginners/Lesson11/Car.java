package Stepic.JavaForBeginners.Lesson11;


public class Car {
    String color;
    String engine;
    int doorQuantity;

    public Car(String color, String engine, int doorQuantity) {
        this.color = color;
        this.engine = engine;
        this.doorQuantity = doorQuantity;
    }

    void changeDoors(int quantity) {
        this.doorQuantity = quantity;
    }

    static void changeColor(Car car1, Car car2) {
        String tmp = car1.color;
        car1.color = car2.color;
        car2.color = tmp;
    }
}
