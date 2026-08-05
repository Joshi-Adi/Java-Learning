class Laptop{
    String lapBrand,lapRam;
    Laptop(){
      this("default","default");
    }
    Laptop(String lapBrand){
      this(lapBrand,"default");
    }
    Laptop(String lapBrand,String lapRam){
        this.lapBrand=lapBrand;
        this.lapRam=lapRam;
    }
    void display(){
        System.out.println(lapBrand+" "+lapRam);
    }
}
class Main {
    public static void main(String[] args) {
        Laptop l=new Laptop("DEll","10gb");
        Laptop l2=new Laptop("DEll");
        Laptop l3=new Laptop();
        l.display();
        l2.display();l3.display();
    }
}
