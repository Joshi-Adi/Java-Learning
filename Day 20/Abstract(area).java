abstract class shape{
    abstract double area();
}
class circle extends shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
class rectangle extends shape{
    int l,b;
    rectangle(int l,int b){
        this.l=l;this.b=b;
    }
    @Override
    public double area(){
        return l*b;
    }
}
class Main {
    public static void main(String[] args) {
        shape a=new circle(10);
        System.out.println(a.area());
        a=new rectangle(5,10);
        System.out.println(a.area());
    }
}
