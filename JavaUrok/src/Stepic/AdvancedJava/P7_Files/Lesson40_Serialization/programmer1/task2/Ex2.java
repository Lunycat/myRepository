package Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer1.task2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex2 {
    public static void main(String[] args) {
        Car car = new Car("БМВ", "V10");
        Employee emp1 = new Employee("Егор", 28, 200.4f, "IT", car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Источник.bat"))) {
            outputStream.writeObject(emp1);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
