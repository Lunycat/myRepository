package Stepic.AdvancedJava.P7_Files;

import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        new Ex().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(gdc(sc.nextInt(), sc.nextInt()));
    }
    int gdc(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a >= b)
            return gdc(a % b, b);
        return gdc(a, b % a);
    }
}