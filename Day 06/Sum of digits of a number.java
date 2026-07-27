import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number\n");
        int n=sc.nextInt(),sum=0;
        while (n>0){
            int r=n%10;
            sum+=r;
            n/=10;
        }
        System.out.println("Sum of digits is "+sum);
    }
}
