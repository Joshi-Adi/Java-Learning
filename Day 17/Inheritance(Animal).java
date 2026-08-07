class Animal{
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    
}
class Main {
    public static void main(String[] args) {
        Animal s=new Animal();
        s.eat();
        Dog d=new Dog();
        d.eat();
    }
}
