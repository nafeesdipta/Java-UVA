package u11850;

import java.util.Arrays;
import java.util.Scanner;

public class U11850 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while(true)
        {
        int t=key.nextInt();
        if(t==0)
        {
        break;
        }
        int flag=0;int d=200;
        int man []=new int[t];
            for (int i = 0; i <man.length; i++) {
                man[i]=key.nextInt();
            }
            Arrays.sort(man);
            int l=1422-man[man.length-1];
            for (int i =0;i<man.length;i++) {
                if(i+1<man.length)
                {
                if(Math.abs(man[i]-man[i+1])>d || l*2>d)
                {
                flag=1;break;
                }
                else{
                    flag=0;}
                }
            }
            if(flag==1)
            {
                System.out.println("IMPOSSIBLE");
            }
            else
            {
                System.out.println("POSSIBLE");
            }
        }
    }
    
}
