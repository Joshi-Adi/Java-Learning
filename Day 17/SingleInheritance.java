class Animal{
    String name;
    public void eat(){
        System.out.println(name+" eats");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println(name+" barks");
    }
}
class Main {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="tinku";
        d.eat();
        d.bark();
    }
}
