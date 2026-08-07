class person{
    String name;int age;
}
class employee extends person{
    int salary;
    public void display(){
        System.out.println("Student Name : "+name+"\n Age : "+age+"\n Salary : "+salary);
    }
}
class Main {
    public static void main(String[] args) {
        
        employee d=new employee();
        d.name="Raju";d.age=20;d.salary=22000;
        d.display();
    }
}
