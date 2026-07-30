import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={10,20,30,30,5,60};
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if (arr[i]==arr[j]){found=true;break;}
            }
        }
        if(found) System.out.println("Duplicates Found");
        else System.out.println("No Duplicates");
    }
}
