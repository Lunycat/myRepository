package JavaTasks.Algoritms.SortAlgoritms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {32, 40, 10, 8, 12, 33, 4342, 35};
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    static int[] mergeSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];
            int j = i;
            while (j > 0 && array[j-1] > tmp)
                array[j] = array[--j];
            array[j] = tmp;
        }
        return array;
    }
}
