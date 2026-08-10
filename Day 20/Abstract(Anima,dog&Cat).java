abstract class Animal{
    abstract void sound();
}
class dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat Meows");
    }
}
class Main {
    public static void main(String[] args) {
        Animal a=new dog();
        a.sound();
        a=new cat();
        a.sound();
    }
}
