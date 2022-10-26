package Stepic.JavaForBeginners.Lesson7;

public class Employee {
    int id;
    public String name;
    private int salary;

    private Employee() {

    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void infoID() {
        System.out.println(id);
    }

    public void infoName() {
        System.out.println(name);
    }

    public void infoSalary() {
        System.out.println(salary);
    }
}
