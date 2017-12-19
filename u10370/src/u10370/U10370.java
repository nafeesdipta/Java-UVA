package u10370;

import java.util.Scanner;

public class U10370 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int t =key.nextInt();
        for (int i = 0; i <t; i++) {
            int s=key.nextInt();
            int sum=0;
            int man [] =new int[s];
            for (int j = 0; j <s; j++) {
                man[j]=key.nextInt();
               sum=sum+man[j];
            }
            double avg=sum/s;
           avg=(float)sum/s;
            double count=0;
            for(int j=0;j<man.length;j++){
                if(man[j]>avg)
                    count++;
            }
             //System.out.printf("%.3f%%%n", (float)count*100/s);
            System.out.printf("%.3f\n", (float)count*100/s);
        }
    }
    
}
