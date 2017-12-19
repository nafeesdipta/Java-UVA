package u11475;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class U11475 {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        
        while(true)
        {           
        String s=br.readLine();        
        String c="";int flag=0;int re=s.length()-1;
            System.out.println("...............................");
            for (int i = 0; i <s.length(); i++) {
                if((Character)s.charAt(i)==(Character)s.charAt(re))
                {
                flag=1;re--;
                }
                else
                {
                    flag=0;
                    for (int j = i; j <s.length(); j++) {
                        if((Character)s.charAt(j)!=(Character)s.charAt(s.length()-1))
                        {
                        c=c.concat(String.valueOf((Character)s.charAt(j)));
                        }
                        else{break;}
                    }
                    String rev=new StringBuffer(c).reverse().toString();
                    s=s.concat(rev);
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println(s);
            }
            else
            {
                System.out.println(s);
            }
        }
    }
    
}
