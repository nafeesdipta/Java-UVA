
package bankprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BankProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int numberofcustomer=0;
        Bank bank=new Bank();
            ArrayList<Customer> c=bank.getCustomer();
        while(true)
        {
        System.out.println("Please Enter Your Choice: ");
        System.out.println("1. Add Customer");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Calculate Interest");
        System.out.println("6. Exit");
       int choice=Integer.parseInt(br.readLine());
        
       switch(choice)
        {
            case 1:
                
                System.out.println("Creating new Account for a Customer");
                System.out.println("Please insert your initial amount");
                double bal = Double.parseDouble(br.readLine());
                System.out.println("Enter your Account Number");
                String acc=br.readLine();
                Account account=new Account(bal, acc);
                System.out.println("Please Enter Your Name :");
                String name=br.readLine();
                Customer cust=new Customer(name, account);
                c.add(cust); 
                numberofcustomer++;
                System.err.println("Number of Customer "+numberofcustomer);
                for (int i = 0; i <c.size(); i++) {
                    System.err.println(c.get(i).getName()+" Name");
                }
                break;
            case 2:
                System.err.println("Enter Account Number");
                acc=br.readLine();
                if(numberofcustomer==0)
                {
                    System.err.println("Account Number Not Found");
                }
                else{
                    boolean found=false;
                    for (int i = 0; i <numberofcustomer; i++) {
                   Account temp = c.get(i).getAccount();
                   String accTemp = temp.getAccountNumber();
                        //System.out.println(accTemp);
                    if(accTemp.equals(acc)){
                        System.err.println("Please Enter The Amount For Deposit");
                        double money= Double.parseDouble(br.readLine());
                   temp.deposit(money);
                    found=true;
                    }
                    }
                    if(found==false){
                        System.err.println("Account Number is not found");  
                    }
                }
                break;
            case 3:
                
                System.err.println("Enter Account Number");
                acc=br.readLine();
                if(numberofcustomer==0)
                {
                    System.err.println("Account Number Not Found");
                }
                else{
                    boolean found=false;
                    for (int i = 0; i <numberofcustomer; i++) {
                   Account temp = c.get(i).getAccount();
                   String accTemp = temp.getAccountNumber();
                        //System.out.println(accTemp);
                    if(accTemp.equals(acc)){
                        System.err.println("Please Enter The Amount For Withdraw");
                        double money= Double.parseDouble(br.readLine());
                   temp.withdraw(money);
                    found=true;
                    }
                    }
                    if(found==false){
                        System.err.println("Account Number is not found");  
                    }
                }
                break;
            case 4:
                
                System.err.println("Enter Account Number");
                acc=br.readLine();
                if(numberofcustomer==0)
                {
                    System.err.println("Account Number Not Found");
                }
                else{
                    boolean found=false;
                    for (int i = 0; i <numberofcustomer; i++) {
                   Account temp = c.get(i).getAccount();
                   String accTemp = temp.getAccountNumber();
                        //System.out.println(accTemp);
                    if(accTemp.equals(acc)){
                       // System.err.println("Please Enter The Amount For Deposit");
                        System.err.println("Balance is : "+temp.getbalance());
                    found=true;
                    }
                    }
                    if(found==false){
                        System.err.println("Account Number is not found");  
                    }
                }
                break;
            case 5:
                
                System.err.println("Enter Account Number");
                acc=br.readLine();
                if(numberofcustomer==0)
                {
                    System.err.println("Account Number Not Found");
                }
                else{
                    boolean found=false;
                    for (int i = 0; i <numberofcustomer; i++) {
                   Account temp = c.get(i).getAccount();
                   String accTemp = temp.getAccountNumber();
                        //System.out.println(accTemp);
                    if(accTemp.equals(acc)){
                   bank.calculateInterest(c.get(i));
                    found=true;
                    }
                    }
                    if(found==false){
                        System.err.println("Account Number is not found");  
                    }
                }
                break;
            case 6:
                System.exit(0);
                break;
            default:
                break;
        }
        }
    }    
}
