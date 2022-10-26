package Stepic.JavaForBeginners.Lesson7;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(3, "Anton", 500);
        emp.infoSalary();
        System.out.println(emp.name + '\n' + emp.id);
    }
}
