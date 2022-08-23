package Algoritms.G4_DivideAndConquer;

public class MaxInArray {
    public static void main(String[] args) {
        int[] array = {0, 32, 1323, 321, 32123, 53, 32, 31, 31, 556};
        System.out.println(max(array));
    }

    public static int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }

        return max;
    }
}
