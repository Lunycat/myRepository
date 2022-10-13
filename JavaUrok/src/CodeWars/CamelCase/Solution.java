package CodeWars.CamelCase;

public class Solution {
    static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        String space;
        int index = 0;

        if (s.contains("_")) space = "_";
        else space = "-";

        while ((index = sb.indexOf(space)) != -1) {
            sb = sb.replace(index, index + 1, "")
                    .replace(index, index + 1, String.valueOf(sb.charAt(index)).toUpperCase());
        }
        s = String.valueOf(sb);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }
}
