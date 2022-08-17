package Test.CoreJava.fib;

public class Main {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int x) {
        int f0 = 0;
        int f1 = 1;
        int sum = 0;

        if (x == 0) return 0;
        if (x == 1) return 1;

        // Складывает сумму из текущего и предыдущего числа
        for (int i = 0; i < x-1; i++) {
            sum = f0 + f1;
            f0 = f1;
            f1 = sum;
        }
        return sum;
    }
}
