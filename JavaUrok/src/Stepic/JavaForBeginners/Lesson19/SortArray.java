package Stepic.JavaForBeginners.Lesson19;

public class SortArray {
    private static void quickSort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];

        while (leftMarker < rightMarker) {
            while (array[leftMarker] < pivot) leftMarker++;
            while (array[rightMarker] > pivot) rightMarker--;
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

    public static void main(String[] args) {
        int[] array = {5, 32, 321, 32, 54, 6, 3, 64, 23, 54, 123, 43, 532};

        quickSort(array, 0, array.length - 1);

        for (int element : array) {
            System.out.println(element);
        }
    }
}
