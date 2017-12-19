package test;
import java.util.*;
public class hashtable {
    public static void main(String[] args) 
    {
        
        Hashtable balance =new Hashtable();
        balance.put("A", 500.0);
        balance.put("B", 200.0);
        Enumeration names;
        String str;
        double dl;
        names= balance.keys();
        while(names.hasMoreElements())
        {
        str = (String)names.nextElement();
            System.out.println(str+" : "+balance.get(str));
            System.out.println("");
        }
     //Put 100.0 in A
     dl = (Double)balance.get("A");
     balance.put("A",new Double(dl+100.0));
        System.out.println("A's new Balance : "+balance.get("A"));
    }    
}
