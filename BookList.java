import java.util.Scanner;

class Book {
    int id;
    String title;
    double price;

    Book(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(id + " | " + title + " | " + price);
    }
}
public class BookList  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            books[i] = new Book(id, title, price);
            sum += price;
        }
        System.out.println("\nBooks with price > 500:");
        for (Book b : books) {
            if (b.price > 500) {
                b.display();
            }
        }
        System.out.println("Average Book Price: " + (sum/5));
    }
}
