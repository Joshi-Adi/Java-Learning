import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence \n");
        String sentence=sc.nextLine();
        System.out.println(sentence.replace(" ","_"));
    }
}
