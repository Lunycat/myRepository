package CodeWars.ReverseString;

public class Reverse {
    static String reverse(String original) {
        String[] array = original.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = new StringBuilder(array[i]).reverse().toString();
        }

        return String.join("-",array);
    }

    public static void main(String[] args) {
        System.out.println(reverse("This is an example!"));
    }
}
