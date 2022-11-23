package Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer1.task2;

import java.io.Serializable;

public class Employee implements Serializable {
    private final long serialVersionUID = 1;
    private String name;
    private int age;
    private float salary;
    private String department;
    private Car car;

    public Employee(String name, int age, float salary, String department, Car car) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", car=" + car +
                '}';
    }
}
