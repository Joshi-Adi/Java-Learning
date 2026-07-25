import java.util.*;
public class main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
       System.out.print("Enter Your username\n");
      String user=sc.next();
       System.out.print("Enter Your Password\n");
      String pass=sc.next();
        if (user.equals("admin") && pass.equals("admin")) {
            System.out.println("Login SuccessFull");}
       else {
            System.out.println("Login Failed");
        }
    }
}
