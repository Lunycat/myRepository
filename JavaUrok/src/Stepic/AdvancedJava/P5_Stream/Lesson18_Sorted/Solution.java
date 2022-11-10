package Stepic.AdvancedJava.P5_Stream.Lesson18_Sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] array = {5, 23, 12, 65, 28, 31, 29, 32, 2, 8, 1};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        List<Student> students = Student.initStudentList();
        students = students.stream()
                .sorted(Comparator.comparing(st -> st.name))
                .collect(Collectors.toList());

        students.forEach(System.out::println);
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