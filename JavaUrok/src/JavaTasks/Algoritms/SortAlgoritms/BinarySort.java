package JavaTasks.Algoritms.SortAlgoritms;

import java.util.Arrays;

public class BinarySort {
    public static void main(String[] args) {
        int[] array = {32, 40, 10, 8, 12, 33, 43, 35};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    static void quickSort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];
        while (leftMarker < rightMarker) {
            while (array[leftMarker] < pivot)
                leftMarker++;
            while (array[rightMarker] > pivot )
                rightMarker--;
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        }
        if (leftMarker < rightBorder) quickSort(array, leftMarker, rightBorder);
        if (leftBorder < rightMarker) quickSort(array, leftBorder, rightMarker);
    }
}

