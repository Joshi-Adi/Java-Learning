class shape{
    public void draw(){
        System.out.println("shape");
    }
}
class circle extends shape{
    public void Draw(){
        System.out.println("Circle");
        draw();
    }
}
class Main {
    public static void main(String[] args) {
        circle c=new circle();
        c.Draw();
    }
}
