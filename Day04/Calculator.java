import java.util.*;
public class main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
       System.out.print("Choose the following:\n 1 addition\n 2 Subtraction\n 3 Multiplication\n4 Division\n");
       int val=sc.nextInt();
      System.out.print("Enter two numbers\n");
      int val1=sc.nextInt(),val2=sc.nextInt();
      switch(val){
        case 1: System.out.println(val1+val2); break;
        case 2: System.out.println(val1-val2); break;
        case 3: System.out.println(val1*val2); break;
        case 4: System.out.println(val1/val2); break;
        default: System.out.println("Invalid option"); break;
       }
    }
}
