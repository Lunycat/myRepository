package Hexlet.CoreJava.fizzBuzz;

public class Main {
    public static void main(String[] args) {
        fizzBuzz(11, 20);
    }

    public static void fizzBuzz(int begin, int end) {
        while (begin <= end) {
            if (begin % 3 == 0 && begin % 5 == 0) System.out.println("FizzBuzz");
            else if (begin % 3 == 0) System.out.println("Fizz");
            else if (begin % 5 == 0) System.out.println("Buzz");
            else System.out.println(begin);
            begin++;
        }
    }
}
