package Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer2.task2;

import Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer1.task2.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex2 {
    public static void main(String[] args) {
        Employee emp1;
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Источник.bat"))) {
            emp1 = (Employee) inputStream.readObject();
            System.out.println(emp1);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
