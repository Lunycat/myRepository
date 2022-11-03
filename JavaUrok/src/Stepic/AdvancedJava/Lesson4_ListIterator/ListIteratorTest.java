package Stepic.AdvancedJava.Lesson4_ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIteratorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPalindrome(scanner.nextLine());
    }

    static void printPalindrome(String str) {
        boolean isPalindrome = true;
        ArrayList<Character> list = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> iteratorNext = list.listIterator();
        ListIterator<Character> iteratorReverse = list.listIterator(list.size());

        while (iteratorNext.hasNext() && iteratorReverse.hasPrevious()) {
            if (!iteratorNext.next().equals(iteratorReverse.previous())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Это палиндром");
        else
            System.out.println("Это не палиндром");
    }
}
