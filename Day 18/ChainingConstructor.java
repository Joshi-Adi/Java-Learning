class Person{
    Person(){
        System.out.println("Person Const");
    }
}
class Employee extends Person{
    Employee(){
        super();
        System.out.println("Employee const");
    }
}
class Manager extends Employee{
    Manager(){
        super();
        System.out.println("Manager const");
    }
}
class Main {
    public static void main(String[] args) {
        Manager m=new Manager();
       }
}
