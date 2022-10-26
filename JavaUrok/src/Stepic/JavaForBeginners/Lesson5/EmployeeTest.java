package Stepic.JavaForBeginners.Lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(12, "Andrew", 28, 2000, "A1");
        Employee employee2 = new Employee(13, "Artem", 25, 8000, "A2");
        employee1.doubleSalary();
        employee2.doubleSalary();
        System.out.println(employee1.salary + "\n" + employee2.salary);
    }
}
