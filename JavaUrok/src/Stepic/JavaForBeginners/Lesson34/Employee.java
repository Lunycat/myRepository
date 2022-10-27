package Stepic.JavaForBeginners.Lesson34;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee("Женёк", "IT", 200);
        Employee emp2 = new Employee("Ваня", "IT", 200);
        Employee emp3 = new Employee("Евгений", "IT", 500);
        Employee emp4 = new Employee("Егор", "IT", 200);
        Employee emp5 = new Employee("Виталик", "Крутойпоц", 250);
        Employee emp6 = new Employee("Валентина Евдокимова", "Хоз", 100);
        Employee emp7 = new Employee("Елизавета", "IT", 350);
        Employee emp8 = new Employee("Санёк", "IT", 300);
        Employee emp9 = new Employee("Серёга", "IT", 600);
        Employee emp10 = new Employee("Какой-то поц", "Какой-то поц", 150);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);
        employees.add(emp9);
        employees.add(emp10);

        filterEmployee(employees, e -> e.department.equals("IT") && e.salary > 300);
        System.out.println();
        filterEmployee(employees, e -> e.name.startsWith("Е") && e.salary < 450);
        System.out.println();
        filterEmployee(employees, e -> e.name.equals(e.department));
    }

    static void printEmployee(Employee e) {
        System.out.println("Имя: " + e.name + ". Отдел: " + e.department + ". Зарплата: " + e.salary);
    }

    static void filterEmployee(ArrayList<Employee> employees, Predicate<Employee> predicate) {
        for (Employee e : employees) {
            if (predicate.test(e))
                printEmployee(e);
        }
    }
}
