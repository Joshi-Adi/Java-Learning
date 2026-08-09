class Employee{
    public void work(){
        System.out.println("Employee works");
    }
}
class Developer extends Employee{
    @Override
    public void work(){
        System.out.println("Developers creates");
    }
}
class Manager extends Employee{
    @Override
    public void work(){
        System.out.println("Manager manage");
    }
}
class Main {
    public static void main(String[] args) {
        Employee c=new Developer();
        c.work();
        Employee d=new Manager();
        d.work();
    }
}
