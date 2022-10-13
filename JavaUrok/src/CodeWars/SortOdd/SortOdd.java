package CodeWars.SortOdd;

public class SortOdd {

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j] && array[i] % 2 != 0 && array[j] % 2 != 0) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        int[] array = sortArray(new int[]{20, 41, 5, 10, 3, 42});
        long finish = System.nanoTime();

        System.out.println(finish - start);

        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
