class Mobile{
    String brand,model;int price;
    Mobile(String brand,String model,int price){
        this.brand=brand;this.model=model;this.price=price;
    }
    void display(){
        System.out.println(brand+" "+model+" "+price);
    }
}
class Main {
    public static void main(String[] args) {
        Mobile m=new Mobile("DEll","1",20000);
        m.display();
    }
}
