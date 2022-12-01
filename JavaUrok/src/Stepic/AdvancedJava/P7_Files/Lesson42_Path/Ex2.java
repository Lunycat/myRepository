package Stepic.AdvancedJava.P7_Files.Lesson42_Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\text.txt");
        String text = "-Privet\n-Privet\n-Kak dela?\n-Horosho";
        Files.write(file, text.getBytes());
        List<String> list = Files.readAllLines(file);
        for (String s : list)
            System.out.println(s);
    }
}
