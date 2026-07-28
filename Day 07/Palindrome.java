import java.util.*;
public class main{
 static String palindrome(int n) {
    int orig=n,num=0;
   while(n>0){
     int r=n%10;
     num=num*10+r;
     n/=10;
   }
   return num==orig?"Palindrome":"Not Palindrome";
}

  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Number\n");
      int n=sc.nextInt();
      System.out.println(palindrome(n));
  }
}
  
