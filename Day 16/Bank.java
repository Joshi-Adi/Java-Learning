class Bank{
    private int number,balance;
    public int getNumb(){
        return this.number;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setNumb(int number){
        if(number>0){
            this.number=number;
        }else{
            System.out.println("Error");
        }
    }
    public void setBalance(int balance){
        if(balance>0){
            this.balance=balance;
        }else{
            System.out.println("Error");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Bank s=new Bank();
        s.setNumb(201);
        s.setBalance(22000);
        System.out.println(s.getNumb()+" "+s.getBalance());
        s.setNumb(-22);
    }
}
