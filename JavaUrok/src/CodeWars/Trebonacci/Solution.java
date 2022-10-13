package CodeWars.Trebonacci;

import java.util.Arrays;

public class Solution {
    public static double[] tribonacci(double[] s, int n) {
        double[] array = Arrays.copyOf(s, n);
        for (int i = 3; i < n; i++) {
            array[i] = array[i-3] + array[i-2] + array[i-1];
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = tribonacci(new double[]{1,1,1}, 10);

        for (double d : array) {
            System.out.print((int)d + " ");
        }
    }
}
