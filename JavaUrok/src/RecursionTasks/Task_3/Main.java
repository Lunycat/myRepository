package RecursionTasks.Task_3;

public class Main {
    public static void main(String[] args) {
        //Является ли число степенью двойки?
        System.out.println(recursion(16));
    }
    // Метод делит "n" на 2 с целью дойти до одного из базисов. Если "n" в итоге станет двойкой, метод выведет "YES"
    // Если же "n" так и не станет двойкой, а станет меньше её, то выведет "NO"
    public static String recursion(double n) {
        if (n == 2) return "YES";
        if (n < 2) return "NO";
        return recursion(n/2);
    }
}
