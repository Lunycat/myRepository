package Stepic.AdvancedJava.P5_Stream.Lesson15_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Integer> listMap = new ArrayList<>(Arrays.asList(3, 4, 1, 7, 10, 31, 2, 6));

        List<Integer> listInt = listMap.stream().map(i -> {
            if (i % 3 == 0)
                i = i/3;
            return i;
        }).collect(Collectors.toList());
        listInt.forEach(e -> System.out.println(e));
    }
}