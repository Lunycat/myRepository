package Stepic.AdvancedJava.P7_Files.Lesson37_FileWriterAndFileReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {
    public static void main(String[] args) {
        String text = "Летний ливень\n" +
                "Гром стреляет, как из пушки.\n" +
                "Хлещет дождь по спинам луж.\n" +
                "Под дождём сидят лягушки –\n" +
                "Принимают тёплый душ.\n" +
                "В. Лёвин";
        try (FileWriter writer = new FileWriter("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\TEXT.txt")) {
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
