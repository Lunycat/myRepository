package StepicJavaForBeginners.Lesson11;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("yellow", "V8", 4);
        Car car2 = new Car("red", "V7", 6);

        System.out.println(car1.doorQuantity);
        car1.changeDoors(8);
        System.out.println(car1.doorQuantity);

        Car.changeColor(car1, car2);

        System.out.println(car1.color);
        System.out.println(car2.color);
    }
}
