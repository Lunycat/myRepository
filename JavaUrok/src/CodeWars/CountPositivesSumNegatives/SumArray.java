package CodeWars.CountPositivesSumNegatives;

import java.util.Arrays;

public class SumArray {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0)
            return new int[]{};
        int count = 0, sumN = 0;
        for (int n : input) {
            if (n > 0) count++;
            else sumN += n;
        }
        return new int[]{count, sumN};
    }

    public static void main(String[] args) {
        int[] array = countPositivesSumNegatives(null);
        System.out.println(Arrays.toString(array));
    }
}
