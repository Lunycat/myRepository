package StepicJavaForBeginners.Lesson32;

import java.io.File;
import java.io.FileOutputStream;

public class ABC {
    static int abc() {
        try {
            File file = new File("C:/Users/Артём/Desktop/text.txt");
            FileOutputStream fi = new FileOutputStream(file);
            fi.write(1);
            System.out.println("try block сработал!");
            return 5;
        } catch (Exception e) {
            System.out.println("Exception");
            return 10;
        } finally {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
