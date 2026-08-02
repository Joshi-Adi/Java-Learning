import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of file with extension");
        String name=sc.next();
        System.out.println(name.endsWith(".pdf"));
    }
}
