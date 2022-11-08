package Stepic.AdvancedJava.P5_Lambda.Lesson13_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        ArrayStudent arrayStudent = Student.studentInit();
        arrayStudent.forEach(student -> System.out.println(student));

        System.out.println();

        arrayStudent.forEachCheck(student -> student.name.startsWith("С") && student.age > 20);
    }
}