import java.util.*;
public class main{
  static boolean even(int n){
    return n%2==0;
  }
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Number\n");
      int n=sc.nextInt();
      System.out.println(even(n));
  }
}
  
