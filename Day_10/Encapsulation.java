class BankAccount{
    private double bal;
    public void setbal(double bal){
        if(bal>0){
            this.bal=bal;
        }
        else{
            System.out.print("Invalid Input");
        }
    }
    public void withDraw(int amt){
         if(amt>=0 && amt<=bal){
            bal-=amt;
            System.out.println("Amount Debited : "+bal);    
         }
         else{
            System.out.println("Invalid Input");
         }
    }
    public double getBal(){
        return bal;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        BankAccount b= new BankAccount();
        b.setbal(1000);
        System.out.println("Balance Amount : "+b.getBal());
        b.withDraw(500);
        
    }
    
}
