package u12468;

import java.util.Scanner;

public class U12468 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
        int s=key.nextInt();
        int d=key.nextInt();
        if(s==-1 || d==-1)
        {
        break;
        }
        int f1=0;int ss=s;int dd=d;
        int f2=0;
        while(s!=d)
        {
        if(s==100){s=0;}
        else{s++;f1++;}
        }
        while(dd!=ss)
        {
        if(dd==100){dd=0;}
        else{dd++;f2++;}
        }
            System.out.println(Math.min(f1, f2));
        }
    }
    
}
