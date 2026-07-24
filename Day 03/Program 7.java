import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Kilometers to Meters");
        System.out.println("2 Meters to Centimeters");
        
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter Kilometers: ");
            int km = scanner.nextInt();
            int meters = km * 1000;
            System.out.println("Meters: " + meters);
        }
        if (choice == 2) {
            System.out.print("Enter Meters: ");
            int meters = scanner.nextInt();
            int cm = meters * 100;
            System.out.println("Centimeters: " + cm);
        }
    }
}
