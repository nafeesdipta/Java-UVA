package u10424;

import java.util.Scanner;

public class U10424 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
        String s1=key.next();int n1=0;
        String s2=key.next();int n2=0;
            for (int i = 0; i <s1.length(); i++) {
                if((int)s1.charAt(i)<97)
                {
                n1=n1+((int)s1.charAt(i)-64);
                }
                else
                {
                n1=n1+((int)s1.charAt(i)-96);
                }
            }
        for (int i = 0; i <s2.length(); i++) {
                if((int)s2.charAt(i)<97)
                {
                n2=n2+((int)s2.charAt(i)-64);
                }
                else
                {
                n2=n2+((int)s2.charAt(i)-96);
                }
            }
        int sum1=0;int sum2=0;
        if(n1>9){
            boolean q=true;
            while(q)
            {                
            while (n1 != 0) {
                        // add last digit to the sum
                        sum1 =sum1+(n1 % 10);
                        // cut last digit
                        n1 =n1/10;
                  }
                if(sum1<9){q=false;n1=sum1;}else{n1=sum1;sum1=0;}
            }
        }
           if(n2>9){
            boolean q=true;
            while(q)
            {                
            while (n2 != 0) {
                        // add last digit to the sum
                        sum2 =sum2+(n2 % 10);
                        // cut last digit
                        n2 =n2/10;
                  }
                if(sum2<9){q=false;n2=sum2;}else{n2=sum2;sum2=0;}
            }
        }
           double dn1=(double)n1;
           double dn2=(double)n2;
           double p=(Math.min(dn1, dn2)/Math.max(dn1, dn2))*100;
          
            System.out.printf("%.2f", p);
            System.out.print(" %");
            System.out.println();
        }
    }
    
}
