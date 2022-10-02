package StepicJavaForBeginners.Lesson12;

public class Student {
    String name;
    int course;
    float grade;

    public Student(String name, int course, float grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    void myEquals(Student st2) {
        if (this.equals(st2)) System.out.println("Студенты равны");
        else System.out.println("Студенты не равны ");
    }

    void differences(Student st2) {
        if (this.name.equals(st2.name)) {
            if (this.course == st2.course) {
                if (this.grade == st2.grade) {
                    System.out.println("Имя, курс, оценки у студентов одинаковые");
                } else {
                    System.out.println("Имя, курс одинаковые, но оценки разные");
                }
            } else {
                System.out.println("Имена одинаковые, но курс разный");
            }
        } else {
            System.out.println("Имена разные");
        }
    }
}
