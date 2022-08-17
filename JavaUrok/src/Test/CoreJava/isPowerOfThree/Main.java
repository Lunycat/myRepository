package Test.CoreJava.isPowerOfThree;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1) return true;

        while (n >= 3) {
            if (n == 3) return true;
            n /= 3;
        }
        return false;
    }
}
