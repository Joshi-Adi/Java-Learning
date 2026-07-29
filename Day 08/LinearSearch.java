import java.util.*;
public class main {
    static boolean linearSearch(int[] arr,int n){
        for(int i:arr){
            if(i==n) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,60,40,100,50,70,80,90};
        System.out.print("Enter Number to search \n");
        int n=sc.nextInt();
        System.out.println(linearSearch(arr,n)?"Found":"Not Found");
    }
}
