package Stepic.AdvancedJava.P7_Files.Lesson43_Files.walkFileTree.p2;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileVisitor {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\Артём\\Desktop\\file");
        Path dir = Paths.get("C:\\Users\\Артём\\Desktop\\file\\X");
        Path destination = Paths.get("C:\\Users\\Артём\\Desktop\\copyHere");
        System.out.println(destination.resolve(source.relativize(dir)));
        Path newDestination;
    }
}

class MyFileVisitor extends SimpleFileVisitor<Path> {
    private Path source;
    private Path destination;

    public MyFileVisitor(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }
    // source = C:\Users\Артём\Desktop\file
    // destination = C:\Users\Артём\Desktop\copyHere
    // newDestination =
    // dir = C:\Users\Артём\Desktop\file
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Зашли в файл " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}