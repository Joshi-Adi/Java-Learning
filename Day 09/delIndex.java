import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={10,20,30,90,-5,60};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index to del:\n");
        int n=sc.nextInt();
        for(int i=n;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
