package JavaTasks.RecursionTasks.Task_1;

public class Main {
    public static void main(String[] args) {
        // Идём от 1 до "n"
        System.out.println(recursion(5));
    }

    public static String recursion(int n) {
        if (n == 1) return "1";
        return recursion(n-1) + " " + n;
    }
}
