class vehicle{
    public void start(){
        System.out.println("car start");
    }
}
class car extends vehicle{
    
}
class Main {
    public static void main(String[] args) {
        vehicle s=new vehicle();
        s.start();
        car d=new car();
        d.start();
    }
}
