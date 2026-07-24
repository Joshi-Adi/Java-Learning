import java.util.*;
public class main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Calculator");
    System.out.println("Menu:");
    System.out.println("1 Addition");
    System.out.println("2 Subtraction");
    System.out.println("3 Multiplication");
    System.out.println("4 Division");
    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();
    System.out.print("Enter Two Numbers\n");
    int num1=sc.nextInt(),num2=sc.nextInt();
     if (choice == 1) {
            System.out.println("Result: " + (num1 + num2));
        } if (choice == 2) {
            System.out.println("Result: " + (num1 - num2));
        } if (choice == 3) {
            System.out.println("Result: " + (num1 * num2));
        } if (choice == 4) {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice! Please select between 1 and 4.");
        }
  }
}
