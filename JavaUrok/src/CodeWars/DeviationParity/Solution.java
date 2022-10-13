package CodeWars.DeviationParity;

public class Solution {
    static int parity(int...array) {
        int count = 0;
        boolean isEven = false;

        for (int i = 0; i < 3; i++) {
            if (array[i] % 2 == 0) count++;
            if (count > 1) isEven = true;
        }

        if (isEven)
            for (int i : array) {
                if (i % 2 != 0) return i;
            }
        else
            for (int i : array) {
                if (i % 2 == 0) return i;
            }
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(parity(1, 1, 2));
    }
}
