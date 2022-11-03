package Hexlet.CoreJava.isBalanced;

public class Main {
    public static void main(String[] args) {
        System.out.println(isBalanced("()()()"));
    }

    public static boolean isBalanced(String str) {
        String[] array = str.split("");
        if (str.equals("") || array.length % 2 != 0 && array[0] != "(" && array[array.length - 1] != ")")
            return false;

        int last = str.length()-1;
        for (int first = 0; first < array.length/2; first++) {
            if (!array[first].equals(array[last]))
                last--;
            if (first != last)
                return true;
        }
        return false;
    }
}
