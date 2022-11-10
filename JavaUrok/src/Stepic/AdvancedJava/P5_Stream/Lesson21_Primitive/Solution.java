package Stepic.AdvancedJava.P5_Stream.Lesson21_Primitive;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Student> students = Student.initStudentList();

        int sum = students.stream()
                .mapToInt(s -> s.age)
                .sum(); // возвращает сумму
        System.out.println(sum);

        double average = students.stream()
                .mapToDouble(s -> s.estimation)
                .average()
                .getAsDouble();
        System.out.println(average);

        int minAge = students.stream()
                .mapToInt(s -> s.age)
                .min()
                .getAsInt();
        System.out.println(minAge);

        double maxEstimation = students.stream()
                    .mapToDouble(s -> s.estimation)
                    .max()
                    .getAsDouble();
        System.out.println(maxEstimation);
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
        Student st1 = new Student("Саша", 23, 9.5);
        Student st2 = new Student("Евгений", 23, 7.8);
        Student st3 = new Student("Дима", 19, 7.1);
        Student st4 = new Student("Настя", 20, 7.5);
        Student st5 = new Student("Света", 19, 8.2);
        Student st6 = new Student("Вася", 21, 8.2);
        return new ArrayList<>(List.of(st1, st2, st3, st4, st5, st6));
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