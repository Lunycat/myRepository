package JavaTasks.RecursionTasks.Task_2;

public class Main {
    public static void main(String[] args) {
        // Идём от "a" до "b"
        System.out.println(recursion(1, 10));
    }
    // Рекурсия по выводу цифр от "a" до "b"
    public static String recursion(int a, int b) {
        if (a < b) return a + " " + recursion(a + 1, b);
        if (a > b) return a + " " + recursion(a - 1, b);
        return Integer.toString(a);
    }
}
