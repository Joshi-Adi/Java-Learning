import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={10,20,30,5,60};
        int first=arr[0],second=arr[0];
        for(int i:arr){
            if (i>first){ second=first;first=i;}
            else if(i>second && i!=first) second=i;
        }
        System.out.println("Second Largest is: "+second);
    }
}
