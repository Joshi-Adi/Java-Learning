import java.util.*;
public class main{
  static int sum(int a,int b){
    return a+b;
  }
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Number\n");
      int a=sc.nextInt(),b=sc.nextInt();
      System.out.println("Sum is "+sum(a,b));
  }
}
  
