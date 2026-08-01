import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine().toLowerCase();
        int count=0;
        for(int i=0;i<string1.length();i++){
            char ch=string1.charAt(i);
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') continue;
             if(ch >= 'a' && ch <= 'z') count++;
        }
        System.out.println("Total consonants are "+count);
        }
}
