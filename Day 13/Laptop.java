import java.util.*;
class Laptop{
    String brand,ram;
    void display(){
        System.out.println(brand+" "+ram);
    }
}
class Main {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.brand="dell";l.ram="3 GB";
        l.display();
    }
}
