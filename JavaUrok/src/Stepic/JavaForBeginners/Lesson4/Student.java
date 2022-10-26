package Stepic.JavaForBeginners.Lesson4;


public class Student {
    int id;
    String name;
    int course;
    float math;
    float economic;
    float language;

    public Student(int id, String name, int course, float math, float economic, float language) {
        this(id, name, course);
        this.math = math;
        this.economic = economic;
        this.language = language;
    }

    public Student(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Student() {

    }

    float arithmeticMean(Student st) {
        return (st.math + st.economic + st.language) / 3;
    }
}
