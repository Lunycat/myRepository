package Algoritms.G4_DivideAndConquer;

import java.util.ArrayList;

public class SumInArray {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            array.add(i);
        }

        System.out.println(sumInArray(array));
    }

    public static int sumInArray(ArrayList<Integer> array) {
        int sum = 0;

        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }

        return sum;
    }
}
