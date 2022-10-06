package JavaTasks.Algoritms.SearchAlgoritms;

import java.util.Arrays;

public class ExponentialSearch {
    public static int exponentialSearch(int[] array, int elementToSearch) {

        if (array[0] == elementToSearch) return elementToSearch;
        if (array[array.length - 1] == elementToSearch) return array.length;

        int range = 1;

        while (range < array.length && array[range] <= elementToSearch) {
            range = range * 2;
        }

        return Arrays.binarySearch(array, range / 2, Math.min(range, array.length), elementToSearch);
    }

    public static void main(String[] args) {
        int[] array = {21, 23, 23, 24, 24, 28, 28, 44, 46, 53, 61, 67, 75, 76, 79, 81,
                83, 83, 86, 86, 92, 93, 100, 106, 107, 116, 117, 119, 130, 138, 139};
        System.out.println(exponentialSearch(array, 130));
    }
}
