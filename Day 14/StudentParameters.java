class Student{
    String name;int age;
    Student(String studname ,int studage){
        name=studname;age=studage;
        System.out.println("Student Created");
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
class Main {
    public static void main(String[] args) {
        Student s=new Student("name",22);
        s.display();
    }
}
