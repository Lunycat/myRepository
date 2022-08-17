package Algoritms.G1_BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 11, 24, 26, 38, 41, 44, 49, 52, 61, 67, 69, 72};
        System.out.println(binarySearch(array, 52));
    }

    public static int binarySearch(int[] array, int item) {
        // Представим, что наш массив уже отсортирован
        // Индекс наименьшего элемента
        int low = 0;
        // Индекс наибольшего элемента
        int high = array.length - 1;
        // Цикл ищет средний элемент в массиве и сверяет его с заданным числом "item"
        // Если заданное число больше, то средний индекс сдвигается на элемент в право
        // После чего сверяет средний элемент между новыми "low" и "high"
        // Если же меньше, то средний индекс сдвигается влево и сверяет так же средний элемент
        while (low <= high) {
            // Индекс среднего чиса
            int mid = (low + high) / 2;

            if (array[mid] == item) {
                return array[mid];
            } else if (array[mid] > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
