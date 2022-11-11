package Stepic.AdvancedJava.P5_Stream.additional_material;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        String a = Stream.of("S", "U", "P", "E", "R").collect(Collectors.joining(".", "(", ")"));
        System.out.println(a);

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1956, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));
        Map<Integer, String> bookMap = bookList
                .stream()
                .collect(Collectors.toMap(book -> book.releaseYear, book -> book.name));
        bookMap.forEach((y, n) -> System.out.println(n + ": " + y));
    }
}

class Book {
    String name;
    int releaseYear;
    String isbn;

    public Book(String name, int releaseYear, String isbn) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getIsbn() {
        return isbn;
    }
}