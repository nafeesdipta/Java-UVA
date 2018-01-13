/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nafees
 */
import java.util.Scanner;
public class Bracket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
    String s =k.next();
    LinkedList a=new LinkedList();
    int i=0;int kk=0;
    boolean flag=true;
    while((i<s.length())&&flag)
    {
      if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
      {
        a.push(s.charAt(i));
      }
      else
      {
        if(s.charAt(i)==')')
        {
          if((Character)a.peek()=='(')
          {
            a.pop();
          }
          else
          {
            flag=false;
            kk=i;
          }
        }
        if(s.charAt(i)=='}')
        {
          if((Character)a.peek()=='{')
          {
            a.pop();
          }
          else
          {
            flag=false;
            kk=i;
          }
        }
        if(s.charAt(i)==']')
        {
          if((Character)a.peek()=='[')
          {
            a.pop();
          }
          else
          {
            flag=false;
            kk=i;
          }
        }
      }
      i++;
    }
    if(flag && a.size==0)
    {
      System.out.println("The Expression is correct");
    }
    else
    {
      System.out.println("The Expression is not correct");
      System.out.println("The error found at "+(kk+1));
    }
    }
    
}
