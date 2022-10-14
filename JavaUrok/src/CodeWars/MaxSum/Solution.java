package CodeWars.MaxSum;

public class Solution {
    static int maxSum(int[] array) {
        int sum = 0, max = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum < 0) sum = 0;
            if (sum > max) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
