class vehicle{
    String brand;int price;
    vehicle(String brand,int price){
        this.brand=brand;this.price=price;
    }
    void display(){
        System.out.println(brand+" "+price);
    }
}
class car extends vehicle{
    String model;
    car(String brand,int price,String model){
        super(brand,price);
        this.model=model;
    }
    void display(){
        super.display();
        System.out.println(super.brand+" "+model);
        
    }
}
class Main {
    public static void main(String[] args) {
        car s=new car("honda",220000,"az");
        s.display();
       }
}
