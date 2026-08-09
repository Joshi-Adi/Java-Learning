class vehicles{
    public void start(){
        System.out.println("Vehicle");
    }
}
class car extends vehicles{
    @Override
    public void start(){
        System.out.println("car starts");
    }
}
class bike extends vehicles{
    @Override
    public void start(){
        System.out.println("bike starts");
    }
}
class Main {
    public static void main(String[] args) {
        vehicles c;
        c=new car();
        c.start();
        c=new bike();
        c.start();
    }
}
