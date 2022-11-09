package Stepic.AdvancedJava.P5_Stream.Lesson16_Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        Student st1 = new Student("Вася", 21, 8.2);
        Student st2 = new Student("Евгений", 23, 7.8);
        Student st3 = new Student("Дима", 19, 7.1);
        Student st4 = new Student("Настя", 20, 7.5);
        Student st5 = new Student("Света", 19, 8.2);
        Student st6 = new Student("Саша", 23, 9.5);
        students1.add(st1);
        students1.add(st2);
        students1.add(st3);
        students1.add(st4);
        students1.add(st5);
        students1.add(st6);

        List<Student> students2 = students1.stream()
                .filter(s -> s.age > 20 && s.estimation > 8.0)
                .collect(Collectors.toList());

        students2.forEach(s -> System.out.println(s));
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", estimation=" + estimation +
                '}';
    }
}