package Stepic.AdvancedJava.Lesson5_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class MyCollections {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Сергей", "Сергеевич", 32);
        Student student2 = new Student("Иван", "Петров", 34);
        Student student3 = new Student("Евгений", "Евгеньевич", 36);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.forEach(student -> System.out.println("Имя: "+student.name+". Фамилия: "+student.surname+". Возраст: "+student.age));
        Collections.sort(students);
        System.out.println("--------------------------------------------------");
        students.forEach(student -> System.out.println("Имя: "+student.name+". Фамилия: "+student.surname+". Возраст: "+student.age));

        int index = Collections.binarySearch(students, new Student("Евгений", "Евгеньевич", 36));
        System.out.println(index);

    }
}

class Student implements Comparable<Student> {
    String name;
    String surname;
    int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        int res = this.name.compareTo(o.name);
        if (res == 0)
            res = this.surname.compareTo(o.surname);
        return res;
    }
}