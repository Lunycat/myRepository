package Stepic.JavaForBeginners.Lesson18;

public class Solution {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Егор");
        StringBuilder sb2 = new StringBuilder("Егор");

        System.out.println(myEquals(sb1, sb2));
    }

    static boolean myEquals(StringBuilder sb1, StringBuilder sb2) {
        if (sb1.length() != sb2.length())
            return false;

        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != sb2.charAt(i))
                return false;
        }
        return true;
    }
}
