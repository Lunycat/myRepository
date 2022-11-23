package Stepic.AdvancedJava.P7_Files.Lesson39_FileInputAndOutputStream;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        try (BufferedInputStream reader = new BufferedInputStream(
                new FileInputStream("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\java.png"));
             BufferedOutputStream writer = new BufferedOutputStream(
                     new FileOutputStream("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\javaCopy.png")))
        {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
