package CodeWars.MultiplesOf3Or5;

public class Multiple {

    static public int solution(int number) {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(solution(10));
    }
}
