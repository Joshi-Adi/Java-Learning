import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence to find word count\n");
        String sent=sc.nextLine();
        int count=0;
        String[] words=sent.split(" ");
        System.out.println(words.length);
    }
}
