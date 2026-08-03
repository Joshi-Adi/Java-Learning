import java.util.*;
class Car{
    String brand,model;
    void display(){
        System.out.println(brand+" "+model);
    }
}
class Main {
    public static void main(String[] args) {
        Car c=new Car();
        c.brand="HONDA";c.model="AMAZE";
        c.display();
    }
}
