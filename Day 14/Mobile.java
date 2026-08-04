class Mobile{
    String brand,model;int price;
    Mobile(String Brand,String Model,int Price){
        brand=Brand;model=Model;price=Price;
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
