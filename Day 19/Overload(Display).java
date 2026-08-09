class Shape{
    public void display(){
        System.out.println("Nothing");
    }
    public void display(String a,int b){
        System.out.println(a+" "+b);
    }
    public void display(String a){
        System.out.println(a);
    }
}
class Main {
    public static void main(String[] args) {
        Shape c=new Shape();
        c.display();
        c.display("Raj",3);
        c.display("Raj");
    }
}
