package JavaTasks.Stepic.Java_for_beginners.StaticAndFinal_1_8;

public class ClassA {
    static final float PI = 3.14f;



    static int multiply(int a, int b, int c) {
        return a*b*c;
    }

    static void divide(int a, int b) {
        System.out.println("Quotient = " + a/b + ". Remainder = " + a%b + ".");
    }
}
