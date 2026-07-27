import java.util.*;
public class ArmStrongNumb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number\n");
        int n=sc.nextInt(),sum=0,num=n;
        while (n>0){
            int r=n%10;
            sum+=r*r*r;
            n/=10;
        }
        System.out.println((sum==num)?"NUM IS ARMSTRONG":"NUM IS NOT ARMSTRONG");
    }
}
