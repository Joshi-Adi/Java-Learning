import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={10,20,30,0,-5,60},sum=0;
        for(int i:arr){
            sum+=i;
        }
        int avg=sum/arr.length;
        for(int i:arr){
            if(i>avg) System.out.print(i+" ");
        }
    }
}
