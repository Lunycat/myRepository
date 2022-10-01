package StepicJavaForBeginners.CreateConstructor_1_5;

public class Employee {
    int id;
    String name;
    int age;
    int salary;
    String department;

    Employee(int id, String name, int age, int salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    int doubleSalary() {
        return salary *= 2;
    }
}
