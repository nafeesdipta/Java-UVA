package cse310.lab1;
import java.util.*;
import java.io.File;
public class Cse310Lab1 
{
    public static void main(String[] args) {        
        Lecturer l=new Lecturer();
        Student [] s = new Student[15];
        St_Data x=new St_Data();
       Menu m=new Menu();       
     Scanner key=new Scanner(System.in);
        for (int p = 0; p < 10; p++) {                   
        System.err.println("Press 1 for Login as Lecturer");
        System.err.println("Press 2 for New Registration");
        System.err.println("Press 3 for Login as Student");
        System.err.println("Press 4 for Back in Menu");
        int i=key.nextInt();
        if(i==1)
        {           
            System.err.println("Enter Username");
            String na=key.next();
            System.err.println("Enter Password");
            String pa=key.next();
            if(na.equals(l.user) && pa.equals(l.pass))
            {
                System.err.println("Login Successful!!!");
                System.out.println("Enter Section Number to Show the list of the Student");
                int a=key.nextInt();
                if(a==1)
                    for (int j = 0; j <x.s1.length; j++)
                    {
                        try
                        {                            
                      System.out.println("Name: "+x.s1[j].name+" id: "+x.s1[j].id  );  
                        }
                        catch(Exception e)
                        {
                            System.out.println("End!!");break;
                        }
                    } 
                if(a==2)
                    for (int j = 0; j <x.s2.length; j++)
                    {
                        try
                        {
                      System.out.println("Name: "+x.s2[j].name+" id: "+x.s2[j].id  );  
                        }
                        catch(Exception e)
                        {
                            System.out.println("End!!");break;
                        }
                    }
                if(a==3)
                    for (int j = 0; j <St_Data.s3.length; j++)
                    { 
                      try
                      {
                      System.out.println("Name: "+St_Data.s3[j].name+" id: "+St_Data.s3[j].id  );                      
                      }
                      catch(Exception e)
                      {
                          System.out.println("End!!");break;
                      }
                    }
            }
            else
            {
                System.err.println("Wrong");
            }
        }        
        else if(i==2)
        {
            m.newreg();
        }
        else if(i==3)
        {
            m.logstd();
        }
        else if(i==4)
        {
        p=0;
        }
    }
    }    
}
