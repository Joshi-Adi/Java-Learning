abstract class vehicle{
    String brand;
    int speed;
    vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
}
class car extends vehicle{
    car(String brand,int speed){
        super(brand,speed);
    }
    public void display(){
        System.out.println(brand+" "+speed);
    }
}
class Main {
    public static void main(String[] args) {
        car a=new car("Honda",120);
        a.display();
    }
}
