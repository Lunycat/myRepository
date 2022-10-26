package Stepic.JavaForBeginners.Lesson7.subPackage;

import Stepic.JavaForBeginners.Lesson7.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(4, "Egor", 500);
        emp.infoID();
        System.out.println(emp.name + '\n');
    }
}
