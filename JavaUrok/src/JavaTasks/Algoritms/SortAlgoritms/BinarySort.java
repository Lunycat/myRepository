package JavaTasks.Algoritms.SortAlgoritms;

import java.util.Arrays;

public class BinarySort {
    public static void main(String[] args) {
        int[] array = {32, 40, 10, 8, 12, 33, 4342, 35};
        System.out.println(Arrays.toString(binarySort(array, 0, array.length - 1)));
    }

    static int[] binarySort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];

        while (leftBorder < rightBorder) {
            while (array[leftMarker] < pivot)
                leftMarker++;
            while (array[rightMarker] > pivot)
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
        if (leftMarker < rightBorder)
            binarySort(array, leftMarker, rightBorder);
        if (leftBorder < rightMarker)
            binarySort(array, leftBorder, rightMarker);


        return array;
    }
}
