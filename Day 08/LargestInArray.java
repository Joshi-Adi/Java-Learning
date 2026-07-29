import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i:arr){
            if(i>max) max=i;
        }
        System.out.print(max);
    }
}
