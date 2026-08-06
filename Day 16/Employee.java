class Employee{
    private int id,salary;
    public int getId(){
        return this.id;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setId(int id){
        if(id>0){
            this.id=id;
        }else{
            System.out.println("Error");
        }
    }
    public void setSalary(int salary){
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("Error");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Employee s=new Employee();
        s.setId(201);
        s.setSalary(22000);
        System.out.println(s.getId()+" "+s.getSalary());
        s.setId(-22);
    }
}
