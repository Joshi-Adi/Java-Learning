class Student{
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name!=null && !name.trim().isEmpty()) this.name=name;
        else System.out.println("Error");
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age>0 && age<100) this.age=age;
        else System.out.println("Error");
    }
}
class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Man");
        s.setAge(22);
        System.out.println(s.getName()+" "+s.getAge());
        s.setName("");
        s.setAge(-1);
    }
}
