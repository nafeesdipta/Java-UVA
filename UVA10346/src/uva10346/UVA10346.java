package uva10346;
import java.util.Scanner;
public class UVA10346 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);      
        while(key.hasNext())
        {
        int n=key.nextInt();
        int k=key.nextInt();        
        int t=n;int c=0;
        boolean f=true;
        while(f)
        {
        c=n/k;
        t=t+c;
        if(c>k)
        {f=true;n=c;}       
        else{f=false;}
            }
        if(c==k){t++;}
         System.out.println(t);
        }
    }    
}
