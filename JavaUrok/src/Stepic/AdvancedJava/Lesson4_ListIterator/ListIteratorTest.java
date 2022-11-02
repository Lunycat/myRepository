package Stepic.AdvancedJava.Lesson4_ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIteratorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        palindrome(scanner.nextLine());
    }

    static void palindrome(String s) {
        boolean isPalindrome = true;
        ArrayList<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (!iterator.next().equals(reverseIterator.previous())) {
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
