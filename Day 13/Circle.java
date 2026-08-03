import java.util.*;
class Circle{
    int r;
    void area(){
        System.out.println("AREA is "+3.14*r*r);
    }
}
class Main {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.r=2;
        c.area();
    }
}
