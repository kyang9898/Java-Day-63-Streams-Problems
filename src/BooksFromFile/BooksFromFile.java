package BooksFromFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Title Of book: ");
        String titleOfBook = scanner.nextLine();
        System.out.println("Enter Year book was published: ");
        int yearPublished = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter how many pages there are in the book: ");
        int numberOfPages = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter author name: ");
        String nameOfAuthor = scanner.nextLine();
    }

    public static List<Book> readBooks(String file) {
        try {
            return Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(part -> new Book(part[0], Integer.parseInt(part[1]), Integer.parseInt(part[2]), part[3]))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

}


