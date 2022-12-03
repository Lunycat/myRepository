package Stepic.AdvancedJava.P10_Reflection;

public class Student {
    public String name;
    public String surname;
    public int age;
    private float average;

    public Student(String name, String surname, int age, float average) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.average = average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
    public float getAverage() {
        return average;
    }

    public void say() {
        System.out.println("Привет");
    }
}
