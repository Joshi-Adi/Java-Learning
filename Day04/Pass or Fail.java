import java.util.*;
public class main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
       System.out.print("Enter marks\n");
      int num=sc.nextInt();
        if (num>=18) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
