class Student{
    private int age;
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Invalid Age");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.setAge(10);
        s.setAge(-23);
        System.out.println(s.getAge());
    }
}
