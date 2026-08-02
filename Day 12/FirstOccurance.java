import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String string=sc.nextLine();
        System.out.println("Enter char to finds its first index");
        char ch=sc.next().charAt(0);
        System.out.println(string.indexOf(ch));
    }
}
