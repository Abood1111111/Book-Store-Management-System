
import java.util.Scanner;
 
public class BookStoreManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the book title: ");

        String bookTitle = scanner.nextLine();
 
        System.out.print("Enter the book price (in BHD): ");

        double bookPrice = scanner.nextDouble();
       
        double vatRate = 0.10; // 10% VAT

        double vatAmount = bookPrice * vatRate;

        double finalPrice = bookPrice + vatAmount;

        System.out.println("\nBook Details:");

        System.out.println("Title: " + bookTitle);

        System.out.println("Price (BHD): " + bookPrice);

        System.out.println("VAT (" + (vatRate * 100) + "%): " + vatAmount);

        System.out.println("Final Price (BHD): " + finalPrice);
 
        scanner.close();

    }

}
