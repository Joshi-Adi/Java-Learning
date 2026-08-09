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
class Main {
    public static void main(String[] args) {
        Animal c=new Dog();
        c.sound();
    }
}
