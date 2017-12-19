package bankprogram;

import java.util.ArrayList;

public class Bank {
  private double interestRate=8.5;
  private double transactionFees=10;
  //private Customer[] customers=new Customer[1000];
  private ArrayList<Customer> customer=new ArrayList<Customer>();
  public void calculateInterest( Customer customer)
   {
   Account a=customer.getAccount();
   double bal=a.getbalance();
   double interestamnt=bal*interestRate/100;
   double totalbalance=bal+interestamnt;    
   System.out.println("Interest Amount "+interestamnt+" Total money after adding interest: "+totalbalance);
   
   }
   public double getinterestRate()
   {
   return interestRate;
   }
   public double gettransanctionfees()
   {
   return transactionFees;
   }
   public ArrayList<Customer> getCustomer()
   {
   return customer;
   }
}
