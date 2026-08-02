import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String string=sc.next();
        int Ucount=0,Lcount=0;
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(ch>='A' && ch<='Z') Ucount++;
            else if(ch>='a' && ch<='z') Lcount++;
        }
        System.out.println("UpperCase count is "+Ucount+"\nLowCase Count is "+Lcount);
    }
}
