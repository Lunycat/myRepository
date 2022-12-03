package Stepic.AdvancedJava.P7_Files.Lesson43_Files.walkFileTree.p2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class Runner {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\Core");
        Path destination = Paths.get("C:\\Users\\xolms\\OneDrive\\Рабочий стол\\CopyHere");
        Files.walkFileTree(source, new CopyFileVisitor(source, destination));
    }
}
public class CopyFileVisitor extends SimpleFileVisitor<Path> {
    private final Path source;
    private final Path destination;

    public CopyFileVisitor(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination);
        return FileVisitResult.CONTINUE;
    }
}