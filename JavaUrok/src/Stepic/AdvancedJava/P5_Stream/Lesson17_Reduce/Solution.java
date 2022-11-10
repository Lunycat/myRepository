package Stepic.AdvancedJava.P5_Stream.Lesson17_Reduce;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

        int resultInt = integerList.stream()
                .reduce((a,e) -> a*e).get();
        System.out.println(resultInt);
        //a = 1  1   2   6   24  120  720  5040  40320
        //e = 1  2   3   4   5    6    7    8

        List<String> stringList = new ArrayList<>(List.of("Привет", "Как дела?", "Хорошо", "Пока"));

        String resultString = stringList.stream().reduce("",(a, e) -> a + " " + e).trim();
        System.out.println(resultString);
    }
}
