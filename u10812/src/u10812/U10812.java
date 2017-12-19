package u10812;

import java.util.Scanner;

public class U10812 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();
        for (int i = 0; i <t; i++) {
            Long num1=key.nextLong();
            Long num2=key.nextLong();
            Long x=(num1+num2)/2;
            Long y=(num1-x);
            if(x>=0 && y>=0 && x-y==num2)
            {
                System.out.println(x+" "+y);
            }          
            else
            {
                System.out.println("impossible");
            }
        }
    }
    
}
