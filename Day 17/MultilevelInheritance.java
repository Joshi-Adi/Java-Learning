class Animal{
    String name;
    public void eat(){
        System.out.println("animal eats");
    }
}
class mammal extends Animal{
    public void breathe(){
        System.out.println("mammal breathes");
    }
}
class Dog extends mammal{
    public void bark(){
        System.out.println("dogs barks");
    }
}
class Main {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.breathe();
        d.bark();
    }
}
