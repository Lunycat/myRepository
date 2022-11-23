package Stepic.AdvancedJava.P7_Files.Lesson38_BufferReaderAndBufferWriter;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Источник.txt"));
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Потребитель.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
