
package u10300;

import java.util.Scanner;

public class U10300 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();
        for (int i = 0; i <t; i++) {
            int f=key.nextInt();
            int sum=0;
            for (int j = 0; j <f; j++) {
                int a=key.nextInt();
                int b=key.nextInt();
                int c=key.nextInt();
                sum=sum+(a*c);
            }
            System.out.println(sum);
        }
    }
    
}
