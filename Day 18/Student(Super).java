class person{
    String name="None";
}
class student extends person{
    String name="None";
    public void display(){
    System.out.println(name+" "+super.name);
    }
}
class Main {
    public static void main(String[] args) {
        student s=new student();
        s.name="Raj";
        s.display();
    }
}
