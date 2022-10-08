package StepicJavaForBeginners.Lesson20;

public class ABC {
    public static void main(String[] args) {
        int count = 0;
        String[] array = abc(new String[]{"a", "b", "c"}, new String[] {"d", "f"});

        for (String element : args) {
            for (int i = 0; i < array.length; i++) {
                if (element.equals(array[i]))
                    array[i] = null;
            }
        }

        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Parametri = ");
        for (String element : args) {
            System.out.print(element + " ");
            count++;
        }
        System.out.println();
        System.out.println("Koli4estvo parametrov = " + count);
    }

    static String[] abc(String[]...array) {
        int length = 0, i = 0;
        for (String[] subArray : array) {
            length += subArray.length;
        }
        String[] localArray = new String[length];

        for (String[] subArray : array) {
            for (String element : subArray) {
                localArray[i++] = element;
            }
        }
        return localArray;
    }
}
