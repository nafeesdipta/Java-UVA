/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankprogram;

/**
 *
 * @author Dipta
 */
public class Customer {
    String name;
    Account account;
    public Customer(String n, Account a)
    {
    name=n;
    account=a;
    }
    public String getName()
    {
    return name;
    }
    public Account getAccount()
    {
    return account;
    }
    public void display()
    {
        System.out.println("Name :"+name+"Account Number : "+account.getAccountNumber()+" Balance: "+account.getbalance());
        
    }
}
