class person{
    String name;
    person(String name){
        this.name=name;
        System.out.println("Parents Constructor "+name);
    }
}
class student extends person{
    int age;
    student(String name,int age){
        super(name);
        this.age=age;
        System.out.println("Child Constructor "+name+" "+age);
    }
}
class Main {
    public static void main(String[] args) {
        student s=new student("Ram",20);
       }
}
