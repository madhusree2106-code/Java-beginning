import java.util.Scanner;

class Book {
    String title;
    boolean available = true;

    Book(String title) { this.title = title; }
}

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = { new Book("Java"), new Book("Python"), new Book("C++") };

        while (true) {
            System.out.println("\n1.View Books 2.Borrow 3.Return 4.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < books.length; i++)
                        System.out.println((i+1) + ". " + books[i].title + (books[i].available ? " ✅" : " ❌"));
                    break;
                case 2:
                    System.out.print("Enter book number: ");
                    int b = sc.nextInt()-1;
                    if (books[b].available) { books[b].available = false; System.out.println("Borrowed!"); }
                    else System.out.println("Already borrowed!");
                    break;
                case 3:
                    System.out.print("Enter book number: ");
                    int r = sc.nextInt()-1;
                    books[r].available = true;
                    System.out.println("Returned!");
                    break;
                case 4: sc.close(); return;
                default: System.out.println("Invalid!");
            }
        }
    }
}