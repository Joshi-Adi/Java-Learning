class Rectangle{
    int length,breadth;
    Rectangle(int length,int breadth){
        this.length=length;this.breadth=breadth;
    }
    void area(){
        System.out.println("Area "+length*breadth);
    }
}
class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,20);
        r.area();
    }
}
