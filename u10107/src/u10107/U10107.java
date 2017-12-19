package u10107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class U10107 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        while(key.hasNext())
        {
        int k=key.nextInt();
        a.add(k);
            Collections.sort(a);int l=0;         
          if(a.size()==1)
            {
            l=a.get(0);
            }         
            else{
                if(a.size()%2==0)
                {
                int x=a.get(a.size()/2);
                int y=a.get((a.size()-1)/2);
                l=(x+y)/2;
                }
                else
                {
                l=a.get(a.size()/2);
                }
          }
            System.out.println(l);
        }
    }
    
}
