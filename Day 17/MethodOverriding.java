class Animal{
    public void sound(){
        System.out.println("animal do sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
class Main {
    public static void main(String[] args) {
        Animal a=new Animal();a.sound();
        Dog d=new Dog();
        d.sound();
    }
}
