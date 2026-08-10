abstract class employee{
    abstract void work();
}
class dev extends employee{
    @Override
    public void work(){
        System.out.println("Developer develops");
    }
}
class manager extends employee{
    @Override
    public void work(){
        System.out.println("Manager manages");
    }
}
class Main {
    public static void main(String[] args) {
        employee a=new dev();
        a.work();
        a=new manager();
        a.work();
    }
}
