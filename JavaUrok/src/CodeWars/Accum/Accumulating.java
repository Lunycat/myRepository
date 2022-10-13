package CodeWars.Accum;

public class Accumulating {
    static String accumulating(String str) {
        StringBuilder result = new StringBuilder();
        result.append(String.valueOf(str.charAt(0)).toUpperCase() + "-");

        for (int i = 1; i < str.length(); i++) {
            result.append(String.valueOf(str.charAt(i)).toUpperCase());
            result.append(String.valueOf(str.charAt(i)).toLowerCase().repeat(i) + "-");
        }
        result.deleteCharAt(result.lastIndexOf("-"));
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(accumulating("abcd"));
    }
}
