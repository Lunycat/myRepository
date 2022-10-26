package Stepic.JavaForBeginners.Lesson34;

import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student st1 = new Student(23, 167);
        Student st2 = new Student(21, 181);
        Student st3 = new Student(32, 176);
        Student st4 = new Student(22, 182);
        Student st5 = new Student(26, 150);
        Student st6 = new Student(26, 200);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        Student.testStudent(students, (Student s) -> {return s.length > 180;});
        System.out.println();
        Student.testStudent(students, (Student s) -> {return s.age > 24;});
    }
}

class Student {
    int age;
    int length;

    public Student(int age, int length) {
        this.age = age;
        this.length = length;
    }

    static void testStudent(ArrayList<Student> students, CheckStudent cs) {
        for (Student student : students) {
            if (cs.check(student)) {
                System.out.println(student.age + " и " + student.length);
            }
        }
    }
}

interface CheckStudent {
    boolean check(Student s);
}