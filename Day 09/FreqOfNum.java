import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={10,20,30,5,60};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number to find freq:\n");
        int key=sc.nextInt(),count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==key) count++;
        }
        System.out.println("Freq of give num is: "+count);
    }
}
