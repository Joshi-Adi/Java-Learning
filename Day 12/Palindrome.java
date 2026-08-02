import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string to check palindrome\n");
        String word=sc.next(),reverse="";
        for(int i=word.length()-1;i>=0;i--){
            char ch=word.charAt(i);
            reverse+=ch;
        }
        System.out.println(word.equals(reverse)?"Palindrome":"Not Palindrome");
    }
}
