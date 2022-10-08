package StepicJavaForBeginners.Lesson20;

public class ForeachLoop {
    public static void main(String[] args) {
        String[] students = {"Ivan", "Petr", "Sergey"};
        String[] exams = {"math", "economic", "geometry"};

        print(students, exams);
    }

    static void print(String[] students, String[] exams) {
        for (String student : students) {
            System.out.print(student);
            for (String exam : exams) {
                System.out.print(" nabral po " + exam + " " + (int)(Math.random() * 100) + " ballov");
            }
            System.out.println();
        }
    }
}
