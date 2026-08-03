import java.util.*;
class Bank{
    int accNum,balance;
    void display(){
        System.out.println(balance);
    }
}
class Main {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.balance=20000;
        b.display();
    }
}
