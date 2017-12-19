package uva382;
import java.util.Scanner;
public class UVA382 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int j=0;
        while(true)
        {
        int t=key.nextInt();int sum=0;
        j++;
        if(t==0){System.out.println("END OF OUTPUT");break;}
            for (int i = 1; i <t; i++) {
                if(t%i==0)
                {
                sum=sum+i;
                }
            }
           if(sum==t)
           {
               if(j==1){System.out.println("PERFECTION OUTPUT");}
               System.out.printf("%5d",t);System.out.print("  PERFECT");System.out.println("");
           }
           else if(sum<t)
           {
               if(j==1){System.out.println("PERFECTION OUTPUT");}
               System.out.printf("%5d",t);System.out.print("  DEFICIENT");System.out.println("");
           }
           else if(sum>t)
           {
                   if(j==1){System.out.println("PERFECTION OUTPUT");}
               System.out.printf("%5d",t);System.out.print("  ABUNDANT");System.out.println("");
           }
        }
    }
    
}
