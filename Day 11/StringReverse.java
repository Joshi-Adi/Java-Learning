import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine(),string2=" ";
        for(int i=string1.length()-1;i>=0;i--){
            char ch=string1.charAt(i);
            string2+=ch;
        }
        System.out.println("Reverseed string is "+string2);
        }
}
