package Stepic.AdvancedJava.P7_Files.Lesson37_FileWriterAndFileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Источник.txt")) {
            int charter;
            while ((charter = reader.read()) != -1) {
                System.out.print((char) charter);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

