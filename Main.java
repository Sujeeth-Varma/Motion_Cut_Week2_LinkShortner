import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        URLShortener shortener = new URLShortener();
        Scanner scanner = new Scanner(System.in);

        // Take user input for the original URL
        System.out.print("Enter the original URL: ");
        String originalURL = scanner.nextLine();

        // Shorten the URL and print the result
        String shortURL = shortener.shortenURL(originalURL);
        System.out.println("Shortened URL: " + shortURL);

        // Close the scanner
        scanner.close();
    }
}

