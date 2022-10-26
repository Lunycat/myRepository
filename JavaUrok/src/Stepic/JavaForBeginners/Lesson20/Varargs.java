package Stepic.JavaForBeginners.Lesson20;

public class Varargs {
    public static void main(String[] args) {
        sum(6,6,10);
    }

    static void sum(int...a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
