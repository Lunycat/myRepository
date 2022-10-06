package JavaTasks.Algoritms.SearchAlgoritms;

public class BinarySearch {

    public static int binarySearch(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == item) return array[mid];
            else if (array[mid] > item) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 11, 24, 26, 38, 41, 44, 49, 52, 61, 67, 69, 72};
        System.out.println(binarySearch(array, 52));
    }
}
