package Stepic.JavaForBeginners.Lesson25;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public void setCourse(int course) {
        if (1 <= course && course < 5)
            this.course = course;
    }

    public void setGrade(int grade) {
        if (1 <= grade && grade < 11)
            this.grade = grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3)
            this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    void showInfo() {
        System.out.println("Имя студента = " + getName() +
                ". Курс студента = " + getCourse() +
                ". Средняя оценка студента = " + getGrade() + ".");
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName(new StringBuilder("Ivan"));
        student.setCourse(2);
        student.setGrade(8);

        student.showInfo();
    }
}
