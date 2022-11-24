package JavaTasks.Algoritms.SearchAlgoritms;

public class InterpolationSearch {

    public static int interpolationSearch(int[] array, int elementToSearch) {

        int startIndex = 0;
        int lastIndex = (array.length - 1);

        while ((startIndex <= lastIndex) && (elementToSearch >= array[startIndex]) &&
                (elementToSearch <= array[lastIndex])) {
            // используем формулу интерполяции для поиска возможной лучшей позиции для существующего элемента
            int pos = startIndex + (((lastIndex-startIndex) /
                    (array[lastIndex] - array[startIndex]))*
                    (elementToSearch - array[startIndex]));

            if (array[pos] == elementToSearch) {
                System.out.println("Element = " + elementToSearch + ". index = " + pos);
                return pos;
            }

            if (array[pos] < elementToSearch)
                startIndex = pos + 1;

            else
                lastIndex = pos - 1;
        }
        System.out.println("Element not found.");
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {21, 23, 23, 24, 24, 28, 28, 44, 46, 53, 61, 67, 75, 76, 79, 81, 83, 83, 86,
                86, 92, 93, 100, 106, 107, 116, 117, 119, 130, 138, 139};
        interpolationSearch(array, 1140);
    }
}
