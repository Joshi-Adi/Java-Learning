import java.util.*;
public class PalindromeNumb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number\n");
        int n=sc.nextInt(),sum=0,num=n;
        while (n>0){
            int r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        System.out.println(sum+" "+num);
        System.out.println((sum==num)?"NUM IS PALINDROME":"NUM IS NOT PALINDROME");
    }
}
