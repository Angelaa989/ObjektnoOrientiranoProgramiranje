import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesete tekst koj ke se pecati:");
        String tekst = scanner.nextLine();
        System.out.println("Napisaniot tekst e: " + tekst);
        scanner.close();
    }
}
