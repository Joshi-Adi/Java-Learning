import java.util.*;
public class main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      System.out.print("Enter number\n");
      int n=sc.nextInt(),count=0;
      while(n>0){
        count+=1;n/=10;
        }
      System.out.println("Digits are "+count);
    }
}
