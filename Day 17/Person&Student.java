class person{
    String name;int age;
}
class student extends person{
    public void display(){
        System.out.println("Student Name : "+name+"\n Age : "+age);
    }
}
class Main {
    public static void main(String[] args) {
        
        student d=new student();
        d.name="Raju";d.age=20;
        d.display();
    }
}
