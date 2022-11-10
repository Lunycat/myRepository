package Stepic.AdvancedJava.P5_Stream.Lesson20_Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDepartment {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Костя", "Маркетинг");
        Employee emp2 = new Employee("Аня", "Маркетинг");
        Employee emp3 = new Employee("Петя", "Маркетинг");
        Employee emp4 = new Employee("Света", "Продажи");
        Employee emp5 = new Employee("Коля", "IT");
        Employee emp6 = new Employee("Сергей", "IT");
        Employee emp7 = new Employee("Егор", "Администрация");
        Employee emp8 = new Employee("Евгений", "Администрация");
        Employee emp9 = new Employee("Анастасия", "IT");
        Employee emp10 = new Employee("Дима", "Продажи");
        List<Employee> employees = new ArrayList<>(List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10));

        Map<String, List<Employee>> employeeMap = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department));
        employeeMap.forEach((k,v) -> System.out.println(k + ": " + v));

        Map<Boolean, List<Employee>> employeeInIT = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.department.contains("IT")));

        employeeInIT.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}