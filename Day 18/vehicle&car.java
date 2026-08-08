class vehicle{
    vehicle(){
        System.out.println("Parents Constructor");
    }
}
class car extends vehicle{
    car(){
        super();
        System.out.println("Child Constructor ");
    }
}
class Main {
    public static void main(String[] args) {
        car s=new car();
       }
}
