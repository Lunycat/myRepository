package Stepic.AdvancedJava.P5_Stream.Lesson16_Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Student>students1 = Student.initStudentList();
        List<Student> studentsFilter;

        studentsFilter = students1.stream()
                .filter(s -> s.age < 21 && s.estimation > 7.2)
                .collect(Collectors.toList());

        studentsFilter.forEach(System.out::println);
    }
}

class Student {
    String name;
    int age;
    double estimation;

    public Student(String name, int age, double estimation) {
        this.name = name;
        this.age = age;
        this.estimation = estimation;
    }

    static List<Student> initStudentList() {
        Student st1 = new Student("Вася", 21, 8.2);
        Student st2 = new Student("Евгений", 23, 7.8);
        Student st3 = new Student("Дима", 19, 7.1);
        Student st4 = new Student("Настя", 20, 7.5);
        Student st5 = new Student("Света", 19, 8.2);
        Student st6 = new Student("Саша", 23, 9.5);
        List<Student> students = new ArrayList<>(List.of(st1, st2, st3, st4, st5, st6));
        return students;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", estimation=" + estimation +
                '}';
    }
}