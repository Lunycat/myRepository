package Algoritms.G4_DivideAndConquer;

import java.util.ArrayList;

public class SumInArrayRecursion {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            array.add(i);
        }

        System.out.println(recursion(array));
    }

    public static int recursion(ArrayList<Integer> array) {
        if (array.size()==1) return array.get(0);
        int sum = 0;
        sum += array.get(0);
        array.remove(0);
        return sum + recursion(array);
    }
}
