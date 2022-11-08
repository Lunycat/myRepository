package Stepic.AdvancedJava.P5_Lambda.Lesson13_Expressions;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int age;
    double estimation;

    public Student(String name, int age, double estimation) {
        this.name = name;
        this.age = age;
        this.estimation = estimation;
    }

    static ArrayStudent studentInit() {
        ArrayStudent arrayStudent = new ArrayStudent();
        Student st1 = new Student("Вася", 21, 8.2);
        Student st2 = new Student("Евгений", 23, 7.8);
        Student st3 = new Student("Дима", 19, 7.1);
        Student st4 = new Student("Настя", 20, 7.5);
        Student st5 = new Student("Света", 19, 8.2);
        Student st6 = new Student("Саша", 23, 9.5);

        arrayStudent.add(st1);
        arrayStudent.add(st2);
        arrayStudent.add(st3);
        arrayStudent.add(st4);
        arrayStudent.add(st5);
        arrayStudent.add(st6);
        return arrayStudent;
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
