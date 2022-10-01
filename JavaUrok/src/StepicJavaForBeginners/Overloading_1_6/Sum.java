package StepicJavaForBeginners.Overloading_1_6;

public class Sum {
    int sum() {
        System.out.println(0);
        return 0;
    }

    int sum(int a) {
        System.out.println(a);
        return a;
    }

    int sum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    int sum(int a, int b, int c) {
        System.out.println(a + b + c);
        return a + b + c;
    }

    int sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
        return a + b + c + d;
    }
}
