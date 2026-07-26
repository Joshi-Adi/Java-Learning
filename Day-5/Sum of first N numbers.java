import java.util.*;
public class main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      System.out.print("Enter number\n");
      int n=sc.nextInt(),sum=0;
      for(int i=1;i<=n;i++){
            sum+=i;
        }
      System.out.print("Sum of first "+n+" are "+sum);
    }
}
