package cse310.lab1;
import java.util.*;
public class Menu {
    Scanner in=new Scanner(System.in);
    Lecturer l=new Lecturer();
        Student [] s = new Student[15];
        St_Data x=new St_Data();
        static Lec_Entry [] le=new Lec_Entry[15];
       Schedule q=new Schedule();
int k=0; 
    public void newreg()
    {               
            System.err.println("Enter Name");
            String name=in.next();            
            System.err.println("Enter sid");
            int sid=in.nextInt();            
            System.err.println("Enter Email");
            String email=in.next();
            System.err.println("Enter Password");
            int password=in.nextInt();
            x.entry(email, password);
            s[k]=new Student(name, sid, email, password);
            le[k]=new Lec_Entry(name, sid);
            k++;               
    }
    public void logstd()
    {
    System.out.println("Enter Email");
            String t=in.next();
            System.err.println("Enter Password");
            int v=in.nextInt();
            x.ret(t, v);
            if(x.ret(t, v)==1)
            {
                System.err.println("Success!!!");
                q.show();
                q.call();
            }
            else if(x.ret(t, v)==0)
            {
                System.out.println("Wrong!!!");
            }
    }
}
