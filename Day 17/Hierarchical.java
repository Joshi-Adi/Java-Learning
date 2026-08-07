class Animal{
    public void eat(){
        System.out.println("animal eats");
    }
}
class cat extends Animal{
    
}
class Dog extends Animal{
}
class Main {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        cat c=new cat();
        c.eat();
    }
}
