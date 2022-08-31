package JavaTasks.Algoritms.G4_DivideAndConquer;

public class QuickSortMyVersion {
    public static void main(String[] args) {
        int[] array = {8, 12, 11, 2, 5, 7, 4};

        quickSort(array, 0, array.length-1);

        for (int number : array) {
            System.out.print(number + " ");
        }
    }

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
}
