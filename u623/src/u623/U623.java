package u623;

import java.math.BigInteger;
import java.util.Scanner;

public class U623 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
            BigInteger a=key.nextBigInteger();
            int k=a.intValue();
            BigInteger sum=BigInteger.valueOf(1);
            for (int i = 1; i <=k; i++) {
                BigInteger x=BigInteger.valueOf(i);
                //BigInteger y=BigInteger.valueOf(i+1);
                sum=(x.multiply(sum));
            }
            System.out.println(k+"!");
            System.out.println(sum);
        }
    }
    
}
