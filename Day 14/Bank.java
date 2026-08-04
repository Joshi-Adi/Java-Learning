class Bank{
    int accNumb,balance;
    Bank(int num,int bal){
        accNumb=num;balance=bal;
    }
    void display(){
        System.out.println("AccNumb "+accNumb+"\nBalance "+balance);
    }
}
class Main {
    public static void main(String[] args) {
        Bank b=new Bank(223,12220);
        b.display();
    }
}
