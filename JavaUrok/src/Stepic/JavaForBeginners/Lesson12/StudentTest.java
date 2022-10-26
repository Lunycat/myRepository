package Stepic.JavaForBeginners.Lesson12;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Anton", 3, 9.1f);
        Student st2 = new Student("Ivan", 2, 8.5f);
        Student st3 = new Student("Ivan", 2, 7.1f);

        st1.myEquals(st2);
        st2.differences(st3);
    }
}
