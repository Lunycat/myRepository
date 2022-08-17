package Algoritms.G3_Recursion;

public class Main {
    public static void main(String[] args) {
        recursion(10);
    }

    public static int recursion(int n) {
        System.out.println(n);
        if (n == 0) return n;
        return recursion(n-1);
    }
}
