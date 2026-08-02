import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string \n");
        String word=sc.next();
        System.out.print("Enter char \n");
        char x=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == x) count++;
        }
        System.out.println(count);
    }
}
