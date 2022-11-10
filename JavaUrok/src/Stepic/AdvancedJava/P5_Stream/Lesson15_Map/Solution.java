package Stepic.AdvancedJava.P5_Stream.Lesson15_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("Раз", "Два", "Привет", "Пока", "Чебурек", "Чебурек"));
        List<Integer> integerList = stringList.stream()
                .distinct()
                .map(String::length)
                .filter(i -> i > 3)
                .collect(Collectors.toList());

        integerList.forEach(System.out::println);
    }
}