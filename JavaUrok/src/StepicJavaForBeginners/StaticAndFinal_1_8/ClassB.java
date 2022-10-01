package StepicJavaForBeginners.StaticAndFinal_1_8;

public class ClassB {
    public static void main(String[] args) {
        ClassA cA = new ClassA();

        System.out.println(ClassA.multiply(4, 4, 4));
        System.out.println(ClassA.multiply(3, 5, 10) + "\n");

        ClassA.divide(10, 5);
        ClassA.divide(14, 8);
        System.out.println();

        System.out.println(cA.areaCircle(5));
        System.out.println(ClassA.circleLength(5) + "\n");

        cA.info(5);
    }
}
