package CodeWars.Eureka;

import java.util.ArrayList;
import java.util.List;

public class Eureka {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> array = new ArrayList<>();
        for (; a <= b; a++) {
            int sum = 0;
            String num = String.valueOf(a);
            for (int i = 0; i < num.length(); i++) {
                if (i == 0)
                    sum += Integer.parseInt(num.substring(0, 1));
                else
                    sum += Math.pow(Integer.parseInt(num.substring(i, i+1)), i+1);
            }
            if (sum == a)
                array.add(a);
        }
        return array;
    }

    public static void main(String[] args) {
        List<Long> array = sumDigPow(1, 100);

        for (long num : array) {
            System.out.print(num + " ");
        }
    }
}
