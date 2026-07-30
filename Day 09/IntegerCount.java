import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={10,20,30,0,-5,60},pos=0,neg=0,zero=0;
        for(int i:arr){
            if(i>0) pos++;
            else if(i<0) neg++;
            else zero++;
        }
        System.out.println("Positive values: " + pos);
        System.out.println("Negative values: " + neg);
        System.out.println("Zero values: " + zero);
    }
}
