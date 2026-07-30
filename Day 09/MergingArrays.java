import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr1[]={10,20,30,0,-5,60},arr2[]={100,200,300,120,-55,650};
        int[] arr3=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=arr1.length;i<arr3.length;i++){
            arr3[i]=arr2[i-arr1.length];
        }
        for(int i:arr3){
            System.out.print(i+" ");
        }
    }
}
