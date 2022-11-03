package Stepic.AdvancedJava.Lesson7_HashCode;

import Stepic.JavaForBeginners.Lesson10.p1.p4.D;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyHashCode {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Егор", "Лутков", 1);
        Student st2 = new Student("Николай", "Петров", 2);
        Student st3 = new Student("Артём", "Иващенко", 2);

        map.put(st1, 7.3);
        map.put(st2, 6.1);
        map.put(st3, 8.6);

        Student st4 = new Student("Артём", "Иващенко", 2);

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}