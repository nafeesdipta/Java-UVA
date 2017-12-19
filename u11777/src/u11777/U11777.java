package u11777;

import java.util.Arrays;
import java.util.Scanner;

public class U11777 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();
        for (int i = 1; i <=t; i++) {
            double t1=key.nextDouble();
            double t2=key.nextDouble();
            double f=key.nextDouble();
            double a=key.nextDouble();
            double man[] =new double[3];
            for (int j = 0; j <man.length; j++) {
                man[j]=key.nextDouble();
            }
            Arrays.sort(man);
            double sum=0;
            sum=t1+t2+f+a+(man[1]+man[2])/2;
            if(sum>=90.0)
            {
                System.out.println("Case "+i+": "+"A");
            }
           else if(sum>=80.0 && sum<90.0)
            {
                System.out.println("Case "+i+": "+"B");
            }
           else if(sum>=70.0 && sum<80.0)
            {
                System.out.println("Case "+i+": "+"C");
            }
           else if(sum>=60.0 && sum<70.0)
            {
                System.out.println("Case "+i+": "+"D");
            }
           else if(sum<60.0)
            {
                System.out.println("Case "+i+": "+"F");
            }
        }
    }
    
}
