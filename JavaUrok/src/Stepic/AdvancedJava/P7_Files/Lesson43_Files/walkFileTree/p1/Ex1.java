package Stepic.AdvancedJava.P7_Files.Lesson43_Files.walkFileTree.p1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Core");
        Files.walkFileTree(file, new MyFileVisitor());
    }
}

class MyFileVisitor implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Вошли в директорию " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Зашли в файл " + file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Ошибка доступа к " + file);
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Вышли из директории " + dir);
        return FileVisitResult.CONTINUE;
    }
}