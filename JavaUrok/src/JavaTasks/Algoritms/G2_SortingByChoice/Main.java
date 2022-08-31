package JavaTasks.Algoritms.G2_SortingByChoice;

public class Main {
    public static void main(String[] args) {
        int[] array = {32, 30, 10, 8, 1, 33, 4342, 35};
        array = selectionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    // Алгоритм по сортировке
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            // Внутренний цикл ищет индекс с наименьшим значением, после чего прирпвнивает его к "minIndex"
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) minIndex = j;
            }
            // После нахождения индекса наименьшего элемента, происходит его перестановка с начльным элементом
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
        return array;
    }
}
