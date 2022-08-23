package Algoritms.G1_BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {
            list.add(i);
        }

        System.out.println(recursion(list, 42));
    }

    public static int recursion(List<Integer> list, int item) {
        int mid = list.size() / 2;
        int element = list.get(mid);

        if (element == item) return element;
        else if (list.size() == 1) return -1;

        return element > item ?
                recursion(list.subList(0, mid), item) :
                recursion(list.subList(mid, list.size()), item);
    }
}
