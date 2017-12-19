package bankprogram;
public class Account {
   private double balance=100;
   private String AccountNumber;
   private boolean firstTime=true;
    public Account(String acc)
    {
    AccountNumber=acc;
    }
    public Account(double bal,String acc)
    {
        if (bal>=100)
        {
        balance=bal;
        }
        else
        {
        balance=100;
        }        
    AccountNumber=acc;
    }
   public void deposit(double howmuch)
    {
    if(howmuch>0)
    {
    balance=balance+howmuch;
        System.out.println(howmuch+" is deposited Suuccessfully"
        +" Your new Balance is: "+balance);
    }
    else
    {
        System.err.println("Please dont put negative value");
    }
    }
    public void withdraw(double howmuch)
    {
    if(howmuch>=0){
        if(firstTime==true)
        {
        double tempBalance=balance;
        tempBalance=tempBalance-howmuch;
        if(tempBalance>=100){
        balance=balance-howmuch;
        }
        else{
            System.err.println("Insufficient Balance!!!");
        }
        firstTime=false;
        }
        else{
            Bank bank=new Bank();
        double tempbal=balance;
        tempbal=tempbal-howmuch-bank.gettransanctionfees();
        if(tempbal>=100){
        balance=balance-howmuch-bank.gettransanctionfees();
        }
        else{
            System.err.println("Insufficient Balance!!!");
        }
        }
        
    }
    else{
        System.err.println("No Negative Value!!!");
    }
    }
    public double getbalance()
    {
    return balance;
    }
    public String getAccountNumber()
    {
    return AccountNumber;
    }
}
