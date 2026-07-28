import java.util.*;
public class main{
  static int factorial(int n){
    if(n<=1) return 1;
    return n*factorial(n-1);
  }
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Number\n");
      int n=sc.nextInt();
      System.out.println("Factorial of given num is "+factorial(n));
  }
}
  
