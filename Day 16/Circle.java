class Circle{
    private int r;
    public int getRadius(){
        return this.r;
    }
    public void setRadius(int r){
        if(r>0){
            this.r=r;
        }else{
            System.out.println("Error");
        }
    }
    public double area(){
        return Math.PI*this.r*this.r;
    }
}
class Main {
    public static void main(String[] args) {
        Circle s=new Circle();
        s.setRadius(10);
        System.out.println(s.getRadius()+" "+s.area());
        s.setRadius(-22);
    }
}
