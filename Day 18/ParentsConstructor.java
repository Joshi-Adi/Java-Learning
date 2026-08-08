class person{
    String name;
    person(){
        System.out.println("Parents Constructor");
    }
}
class student extends person{
    student(){
        super();
        System.out.println("Child Constructor");
    }
}
class Main {
    public static void main(String[] args) {
        student s=new student();
       }
}
