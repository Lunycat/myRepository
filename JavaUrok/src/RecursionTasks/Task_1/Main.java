package RecursionTasks.Task_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(5));
    }

    public static String recursion(int n) {
        if (n == 1) return "1";
        return recursion(n-1) + " " + n;
    }
}
