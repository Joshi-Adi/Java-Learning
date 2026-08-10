abstract class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
    abstract void sound();
    public void eats(){
        System.out.println("Animal eats");
    }
}
class dog extends Animal{
    dog(String name){
        super(name);
    }
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class Main {
    public static void main(String[] args) {
        Animal a=new dog("RAju");
        a.sound();
        a.eats();
    }
}
