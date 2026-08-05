class Employee{
    int id,salary;
    Employee(int id,int salary){
        this.id=id;this.salary=salary;
    }
    void display(){
        System.out.println(id+" "+salary);
    }
}
class Main {
    public static void main(String[] args) {
        Employee s=new Employee(2033,220000);
        s.display();
    }
}
