package JavaTasks.Algoritms.SortAlgoritms;

import java.util.Arrays;

public class BumbleSort {
    public static void main(String[] args) {
        int[] array = {32, 40, 10, 8, 12, 33, 4342, 35};
        System.out.println(Arrays.toString(bumbleSort(array)));
    }

    static int[] bumbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}