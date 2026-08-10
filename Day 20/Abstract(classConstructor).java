abstract class person{
    person(){
        System.out.println("Person");
    }
}
class student extends person{
    student(){
        System.out.println("Student");
    }    
}
class Main {
    public static void main(String[] args) {
        student a=new student();
    }
}
