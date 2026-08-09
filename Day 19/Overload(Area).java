class Shape{
    public void Area(int a){
        System.out.println(a*a);
    }
    public void Area(int a,int b){
        System.out.println(a*b);
    }
    public void Area(double a){
        System.out.println(Math.PI*a*a);
    }
}
class Main {
    public static void main(String[] args) {
        Shape c=new Shape();
        c.Area(3);
        c.Area(5,3);
        c.Area(5.0);
    }
}
