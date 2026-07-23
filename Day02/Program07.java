import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("What is your name?\n");
      String name=sc.next();
      System.out.print("What is your age?\n");
      int age=sc.nextInt();
      System.out.print("Where do you live?\n");
      String city=sc.next();
      System.out.println("Hello!"+name+"\nYou're "+age+" years old\nYou live in "+city);
    }
}
