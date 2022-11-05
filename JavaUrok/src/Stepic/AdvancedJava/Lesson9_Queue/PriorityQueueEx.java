package Stepic.AdvancedJava.Lesson9_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        Student st1 = new Student("Егор", "Лутков", 1);
        Student st2 = new Student("Николай", "Петров", 2);
        Student st3 = new Student("Артём", "Иващенко", 2);

        priorityQueue.offer(st1);
        priorityQueue.offer(st2);
        priorityQueue.offer(st3);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());
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
}