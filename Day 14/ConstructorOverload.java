class Laptop{
    String brand,ram;
    Laptop(){
    }
    Laptop(String lapBrand){
        brand=lapBrand;
    }
    Laptop(String lapBrand,String lapRam){
        brand=lapBrand;
        ram=lapRam;
    }
    void display(){
        System.out.println(brand+" "+ram);
    }
}
class Main {
    public static void main(String[] args) {
        Laptop l=new Laptop("DEll","10gb");
        Laptop l2=new Laptop("DEll");
        Laptop l3=new Laptop("10gb");
        Laptop l4=new Laptop();
        l.display();
        l2.display();l3.display();l4.display();
    }
}
