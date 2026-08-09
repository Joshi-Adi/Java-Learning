class Calculator{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(double a,double b){
        System.out.println(a+b);
    }
}
class Main {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(1,3);
        c.add(1,2,3);
        c.add(1.4,5.7);
    }
}
