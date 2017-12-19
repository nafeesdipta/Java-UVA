package u10929;

import java.math.BigInteger;
import java.util.Scanner;

public class U10929 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
            String t=key.next();
            BigInteger tt=new BigInteger(t);
            BigInteger s=tt.mod(BigInteger.valueOf(11));
        if(t.equals("0")){break;}        
        else{
        if(s.compareTo(BigInteger.ZERO)==0)
        {
            System.out.println(t+" is a multiple of 11.");
        }
       else {
        System.out.println(t+" is not a multiple of 11.");
        }
        }
        }
    }
    
}
