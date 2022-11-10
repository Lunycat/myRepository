package Stepic.AdvancedJava.P5_Stream.Lesson19_FlatMap;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Faculty> facultyList = new ArrayList<>();
        Faculty f1 = Faculty.initFacultyList1();
        Faculty f2 = Faculty.initFacultyList2();

        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream()
                .flatMap(faculty -> faculty.listOfFaculty.stream())
                .forEach(System.out::println);
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

class Faculty {
    List<Student> listOfFaculty;
    String name;

    public Faculty(String name) {
        this.name = name;
        listOfFaculty = new ArrayList<>();
    }

    public List<Student> getListOfFaculty() {
        return listOfFaculty;
    }

    void addStudentOnFaculty(Student student) {
        listOfFaculty.add(student);
    }

    static Faculty initFacultyList1() {
        Student st1 = new Student("Саша", 23, 9.5);
        Student st2 = new Student("Евгений", 23, 7.8);
        Student st3 = new Student("Дима", 19, 7.1);
        Student st4 = new Student("Настя", 20, 7.5);
        Faculty f = new Faculty("Факультет биологии");

        f.addStudentOnFaculty(st1);
        f.addStudentOnFaculty(st2);
        f.addStudentOnFaculty(st3);
        f.addStudentOnFaculty(st4);

        return f;
    }

    static Faculty initFacultyList2() {
        Student st5 = new Student("Света", 19, 8.2);
        Student st6 = new Student("Вася", 21, 8.2);
        Faculty f = new Faculty("Факультет математики");

        f.addStudentOnFaculty(st5);
        f.addStudentOnFaculty(st6);

        return f;
    }
}