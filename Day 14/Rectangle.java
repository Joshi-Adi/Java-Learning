class Rectangle{
    int length,breadth;
    Rectangle(int l,int b){
        length=l;breadth=b;
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
