import java.util.*;
public class main{
  static int add(int a,int b){
    return a+b;
  }
  static int subtract(int a,int b){
    return a-b;
  }
  static int multiply(int a,int b){
    return a*b;
  }
  static int divide(int a,int b){
    return a/b;
  }
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Numbers\n");
      int a=sc.nextInt(),b=sc.nextInt();
      System.out.print(" Choose the following\n 1 Addition\n 2 Subtraction\n 3 Multiplication\n 4 Division\n");
      System.out.print("Enter Your Choice\n");
      int n=sc.nextInt();
      System.out.print("Result is ");
      switch(n){
        case 1:
          System.out.println(add(a,b));break;
        
        case 2:
          System.out.println(subtract(a,b));break;
        
        case 3:
          System.out.println(multiply(a,b));break;
        
        case 4:
          System.out.println(divide(a,b));break;
        default:
           System.out.println("Invalid Choice");
      }
  }
}
  
