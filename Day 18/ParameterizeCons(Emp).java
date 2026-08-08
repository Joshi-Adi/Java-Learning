class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;this.age=age;
        System.out.println("Parents Constructor "+name+" "+age);
    }
}
class employee extends person{
    int salary;
    employee(String name,int age,int salary){
        super(name,age);
        this.salary=salary;
        System.out.println("Child Constructor "+name+" "+age+" "+salary);
    }
}
class Main {
    public static void main(String[] args) {
        employee s=new employee("Ram",20,20000);
       }
}
