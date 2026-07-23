import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Your Marks in maths?\n");
      int maths=sc.nextInt();
      System.out.print("Your Marks in physics?\n");
      int phys=sc.nextInt();
      System.out.print("Your Marks in Chemistry?\n");
      int chem=sc.nextInt();
      System.out.println("Your Total marks are:"+maths+phys+chem);
    }
}
