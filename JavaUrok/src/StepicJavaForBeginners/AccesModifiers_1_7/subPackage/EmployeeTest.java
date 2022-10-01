package StepicJavaForBeginners.AccesModifiers_1_7.subPackage;

import StepicJavaForBeginners.AccesModifiers_1_7.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(4, "Egor", 500);
        emp.infoID();
        System.out.println(emp.name + '\n');
    }
}
