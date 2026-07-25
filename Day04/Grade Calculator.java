import java.util.*;
public class main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
       System.out.print("Enter Your marks\n");
      int num=sc.nextInt();
        if (num>=90) {
            System.out.println("Your grade is A");
        } else if(num>=80){
            System.out.println("Your grade is B");
        }
       else if(num>=70){
            System.out.println("Your grade is C");
        }
       else if(num>=60){
            System.out.println("Your grade is E");
        }
       else {
            System.out.println("Your grade is F");
        }
    }
}
