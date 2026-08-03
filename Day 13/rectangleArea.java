import java.util.*;
class Rectangle{
    int length,breadth;
    void area(){
        System.out.println("AREA is "+length*breadth);
    }
}
class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;r.breadth=30;
        r.area();
    }
}
