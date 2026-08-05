class Student{
    String name;int age;
    Student(){
        this("default",0);
    }
    Student(String name){
        this(name,0);
    }
    Student(String studname ,int age){
        this.name=name;this.age=age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
class Main {
    public static void main(String[] args) {
        Student s=new Student("name",22);
        Student s1=new Student("name");
        Student s2=new Student();
        s.display();s1.display();s2.display();
    }
}
