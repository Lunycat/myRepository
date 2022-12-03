package Stepic.AdvancedJava.P7_Files.Lesson43_Files.walkFileTree.p3;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class Runner {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\CopyHere");
        Files.walkFileTree(source, new DeleteAll());
    }
}

public class DeleteAll extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Был удалён файл " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Была удалена директория " + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}
