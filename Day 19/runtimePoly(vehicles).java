class vehicles{
    public void wheels(){
        System.out.println("Vehicle");
    }
}
class car extends vehicles{
    @Override
    public void wheels(){
        System.out.println("4 wheels car");
    }
}
class bike extends vehicles{
    @Override
    public void wheels(){
        System.out.println("2 wheels bike");
    }
}
class Main {
    public static void main(String[] args) {
        vehicles c=new car();
        c.wheels();
        vehicles d=new bike();
        d.wheels();
    }
}
