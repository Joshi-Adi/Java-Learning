import java.util.*;
public class main{
  static int cube(int n){
    return n*n*n;
  }
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Number\n");
      int n=sc.nextInt();
      System.out.println(cube(n));
  }
}
  
