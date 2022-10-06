package StepicJavaForBeginners.Lesson18;

public class Equals {
    static boolean myEquals(StringBuilder sb1, StringBuilder sb2) {
        String str1 = new String(sb1);
        String str2 = new String(sb2);

        return str1.equals(str2);
    }
}
