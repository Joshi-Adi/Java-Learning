class Shape{
    public void draw(){
        System.out.println("Shapes");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle Shape");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Rectangle shape");
    }
}
class Main {
    public static void main(String[] args) {
        Shape c=new Circle();
        c.draw();
        Shape d=new Rectangle();
        d.draw();
    }
}
