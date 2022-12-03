package Stepic.AdvancedJava.P8_REGEX.Lesson44;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
    public static void main(String[] args) {
        String s = "ABDSDSABSSDS";
        Pattern pattern = Pattern.compile("AB[B-z]");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find())
            System.out.println(matcher.group());
    }
}
