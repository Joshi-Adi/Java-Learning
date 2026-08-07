class Bank{
    int acc,bal;
}
class savings extends Bank{
    public void display(){
        System.out.println(acc+" "+bal);
    }
}
class Main {
    public static void main(String[] args) {
        savings c=new savings();
        c.acc=222;c.bal=23000;
        c.display();
    }
}
