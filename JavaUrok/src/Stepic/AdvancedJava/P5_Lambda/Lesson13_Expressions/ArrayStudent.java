package Stepic.AdvancedJava.P5_Lambda.Lesson13_Expressions;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ArrayStudent {
    Student[] students = new Student[100];

    void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    void forEach(Consumer<Student> consumer) {
        for (Student s : students) {
            if (s == null)
                break;

            consumer.accept(s);
        }
    }

    void checkStudentsAge(Predicate<Student> predicate) {
        for (Student s : students) {
            if (s == null)
                break;

            if (predicate.test(s))
                System.out.println(s);
        }
    }

    void checkStudentsName(Predicate<Student> predicate) {
        for (Student s : students) {
            if (s == null)
                break;

            if (predicate.test(s))
                System.out.println(s);
        }
    }
}
