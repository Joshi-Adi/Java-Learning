import java.util.*;
public class main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    int age=sc.nextInt();
    double cgpa=sc.nextDouble();
    char grade=sc.next().charAt(0);
    boolean graduated=sc.nextBoolean();
    System.out.println(name+"\n"+age+"\n"+cgpa+"\n"+grade+"\n"+graduated);    
    
  }
}
