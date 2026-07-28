import java.util.*;
public class main{
 static char calculateGrade(int score) {
    if (score < 0 || score > 100) return 'X';
    if (score >= 90) return 'A';
    if (score >= 80) return 'B';
    if (score >= 70) return 'C';
    if (score >= 60) return 'D';
    return 'F';
}

  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Marks\n");
      int n=sc.nextInt();
      System.out.println("Grade is "+calculateGrade(n));
  }
}
  
