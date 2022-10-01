package StepicJavaForBeginners.StaticAndFinal_1_8;

public class ClassA {
    static final float PI = 3.14f;

    float areaCircle(int radius) {
        return PI * (float) Math.pow(radius, 2);
    }

    static float circleLength(int radius) {
        return 2 * PI * radius ;
    }

    void info(int radius) {
        System.out.println("Radius = " + radius);
        System.out.println("Area of the Circle = " + areaCircle(radius));
        System.out.println("Circle length = " + circleLength(radius));
    }

    static int multiply(int a, int b, int c) {
        return a*b*c;
    }

    static void divide(int a, int b) {
        System.out.println("Quotient = " + a/b + ". Remainder = " + a%b + ".");
    }
}
