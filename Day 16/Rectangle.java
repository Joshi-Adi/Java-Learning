class Rectangle{
    private int l,b;
    public int getLength(){
        return this.l;
    }
    public int getBreadth(){
        return this.b;
    }
    public void setLength(int l){
        if(l>0){
            this.l=l;
        }else{
            System.out.println("Error");
        }
    }
    public void setBreadth(int b){
        if(b>0){
            this.b=b;
        }else{
            System.out.println("Error");
        }
    }
    public void display(){
        System.out.println("Area is "+l*b);
    }
}
class Main {
    public static void main(String[] args) {
        Rectangle s=new Rectangle();
        s.setLength(10);
        s.setBreadth(20);
        System.out.println(s.getLength()+" * "+s.getBreadth());s.display();
        s.setLength(0);
    }
}
