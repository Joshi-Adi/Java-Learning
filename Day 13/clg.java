import java.util.*;
class Clg{
    String name,city;
    void display(){
        System.out.println(name+" "+city);
    }
}
class Main {
    public static void main(String[] args) {
        Clg c=new Clg();
        c.name="rbs";c.city="Hyd";
        c.display();
    }
}
