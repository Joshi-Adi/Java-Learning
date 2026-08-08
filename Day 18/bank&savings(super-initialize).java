class BankAcc{
    int accnum,bal;
    BankAcc(int accnum,int bal){
        this.accnum=accnum;this.bal=bal;
    }
}
class savings extends BankAcc{
    int rate;
    savings(int accnum,int bal,int rate){
        super(accnum,bal);
        this.rate=rate;
    }
    public void display(){
        System.out.println(accnum+" "+bal+" "+rate);
    }
}
class Main {
    public static void main(String[] args) {
        savings s=new savings(22,20000,25);
        s.display();
       }
}
