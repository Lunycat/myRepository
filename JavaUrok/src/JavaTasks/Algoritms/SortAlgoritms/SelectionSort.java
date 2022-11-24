package JavaTasks.Algoritms.SortAlgoritms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {32, 40, 10, 8, 12, 33, 4342, 35};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
        return array;
    }
}
