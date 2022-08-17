package Uroki;

public class Hexlet {
    public static void main(String[] args) {
        System.out.println(encrypt("gogp!"));
    }

    public static String encrypt(String str) {
        // BEGIN
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            String nextSymbol = (i + 2 > str.length()) ? "" : str.substring(i + 1, i + 2);
            result = result + nextSymbol + str.charAt(i);
        }

        return result;
        // END
    }
}
