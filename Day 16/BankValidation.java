class Bank{
    private int balance;
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        if(balance>0){
            this.balance=balance;
        }else{
            System.out.println("Invalid balance");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Bank s=new Bank();
        s.setBalance(10);
        s.setBalance(-23);
        System.out.println(s.getBalance());
    }
}
