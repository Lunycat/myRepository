package Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer1.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>(Arrays.asList("Артём", "Иван", "Егор"));
        try (ObjectOutputStream writer = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Источник.bat"))) {
            writer.writeObject(employees);
        }
        catch (IOException e) {throw new RuntimeException(e);}
    }
}
