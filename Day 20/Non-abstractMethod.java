abstract class Animal{
    abstract void sound();
    public void eat(){
        System.out.println("Animal Eats");
    }
}
class dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
    @Override
    public void eat(){
        System.out.println("Dog eats");
    }
}
class Main {
    public static void main(String[] args) {
        Animal a=new dog();
        a.sound();
        a.eat();
    }
}
