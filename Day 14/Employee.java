class Employee{
    String name;int salary;
    Employee(String empName ,int empSalary){
        name=empName;salary=empSalary;
    }
    void display(){
        System.out.println(name);
        System.out.println(salary);
    }
}
class Main {
    public static void main(String[] args) {
        Employee e=new Employee("Raj",22000);
        e.display();
    }
}
