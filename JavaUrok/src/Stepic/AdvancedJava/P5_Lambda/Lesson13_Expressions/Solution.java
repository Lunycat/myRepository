package Stepic.AdvancedJava.P5_Lambda.Lesson13_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        List<Student> stArray = Student.initArray();

        Student.checkStudents(stArray, student -> student.name.contains("Д"));
        Student.checkStudents(stArray, student -> student.age > 20);

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

    public static void checkStudents(List<Student> list, Predicate<Student> predicate) {
        for (Student s : list) {
            if (predicate.test(s))
                System.out.print(s.name + " ");
        }
        System.out.println();
    }

    public static List<Student> initArray() {
        ArrayList<Student> studList = new ArrayList<>();
        Student st1 = new Student("Вася", 21, 8.2);
        Student st2 = new Student("Евгений", 23, 7.8);
        Student st3 = new Student("Дима", 19, 7.1);
        Student st4 = new Student("Настя", 20, 7.5);
        Student st5 = new Student("Света", 19, 8.2);
        Student st6 = new Student("Саша", 23, 9.5);

        studList.add(st1);
        studList.add(st2);
        studList.add(st3);
        studList.add(st4);
        studList.add(st5);
        studList.add(st6);
        return studList;
    }
}