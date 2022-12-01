package Stepic.AdvancedJava.P7_Files.Lesson42_Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex1 {
    public static void main(String[] args) throws IOException {

        Path file1 = Paths.get("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\text.txt");
        Path file2 = Paths.get("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\moveText.txt");
        Path directory1 = Paths.get("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\M");
        Path directory2 = Paths.get("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\B");
        // Копируем "file1" в "directory1" посредством указания пути: "C:\Users\xolms\OneDrive\Рабочий стол\M\MyText.txt"
        Files.copy(file1, directory1.resolve("myText.txt"), StandardCopyOption.REPLACE_EXISTING);
        // Перемещаем "file2" в "directory1" посредством указания пути: "C:\Users\xolms\OneDrive\Рабочий стол\M\move.txt"
        Files.move(file2, directory1.resolve("move.txt"));
        Files.move(directory2, directory1.resolve("A"));
        Files.delete(directory2);
    }
}
