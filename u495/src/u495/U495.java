package u495;

import java.math.BigInteger;
import java.util.Scanner;

public class U495 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
        int f=key.nextInt();
        if(f==0 || f==1){
            System.out.println("The Fibonacci number for "+f+" is "+f);
        }      
        else
        {
            BigInteger man[]=new BigInteger[f+1];
       man[0]=BigInteger.valueOf(0);
       man[1]=BigInteger.valueOf(1);
            for (int i = 2; i <man.length; i++) {
                man[i]=man[i-1].add(man[i-2]);
            }
             System.out.println("The Fibonacci number for "+f+" is "+man[man.length-1]);
        }
        }
    }   
}
