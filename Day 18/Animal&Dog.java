class Animal{
    void sound(){
        System.out.println("Animal makes sounds");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        super.sound();
        System.out.println("Dog Barks");
    
    }
}
class Main {
    public static void main(String[] args) {
        Dog s=new Dog();
        s.sound();
    }
}
