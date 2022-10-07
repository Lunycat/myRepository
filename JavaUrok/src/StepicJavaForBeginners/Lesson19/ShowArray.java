package StepicJavaForBeginners.Lesson19;

public class ShowArray {
    static void showArray(int[][] array) {

    }

    public static void main(String[] args) {
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
        }

        showArray(array);
    }
}
