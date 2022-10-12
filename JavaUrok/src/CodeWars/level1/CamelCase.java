package CodeWars.level1;

public class CamelCase {
    static String toCamelCase(String s){
        StringBuilder sb = new StringBuilder(s);
        int indexOfLetter = 0;
        String letter = "";

        while (true) {
            indexOfLetter = sb.indexOf("_", indexOfLetter);
            sb.replace(indexOfLetter, ++indexOfLetter, "a");
            if (indexOfLetter != 3) break;
        }
        System.out.println(sb);
        return "";
    }

    public static void main(String[] args) {
        toCamelCase("Kolya_est_chipsi");
    }
}
