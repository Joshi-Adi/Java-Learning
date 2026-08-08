class Shape{
    void draw(){
        System.out.println("Shape method");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        super.draw();
        System.out.println("Circle method");
    }
}
class Main {
    public static void main(String[] args) {
        Circle s=new Circle();
        s.draw();
       }
}
