package Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer2.task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> employees;
        try (ObjectInputStream reader = new ObjectInputStream(
                new FileInputStream("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Источник.bat"))) {
            employees = (ArrayList)reader.readObject();
            System.out.println(employees);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
