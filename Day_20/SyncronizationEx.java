class Bank{
    int bal=1000;
    synchronized void withdraw(int amt){
        if(amt<=bal){
            System.out.println("Amount withdraw Successfully");
            bal-=amt;
            System.out.println("Remaining:"+bal);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
class BankThread extends Thread{
    Bank bank;
    BankThread(Bank bank){
        this.bank=bank;
    }
    public void run(){
        bank.withdraw(800);
    }
}
public class SyncronizationEx {
    public static void main(String[] args) {
        Bank b=new Bank();

        BankThread b1=new BankThread(b);
        BankThread b2=new BankThread(b);
        b1.start();
        b2.start();

    }
}
