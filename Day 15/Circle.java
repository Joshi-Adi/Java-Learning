class Circle{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    void area(){
        System.out.println("Area "+ Math.PI*radius*radius);
    }
}
class Main {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        c.area();
    }
}
