class Animal{
    public void sound(){
        System.out.println("Animal Sounds");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat meows");
    }
}
class Main {
    public static void main(String[] args) {
        Animal c=new Dog();
        c.sound();
        Animal d=new cat();
        d.sound();
    }
}
