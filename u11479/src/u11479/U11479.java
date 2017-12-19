package u11479;
import java.util.Arrays;
import java.util.Scanner;
public class U11479 {
    public static void main(String[] args) {         
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();
        for(int i =1; i<=t;i++)
        {
            long a = key.nextLong();
            long b = key.nextLong();
            long c = key.nextLong();
            if(((a+b) <= c) ||((b+c) <= a) || ((a+c) <= b) || a<=0 || b<=0 || c<=0)
            {
            System.out.println("Case "+i+": Invalid");
            }
            else if(a==b && b==c && c==a)
            {
                System.out.println("Case "+i+": Equilateral");
            }
            else if((a==b && b!=c) || (b==c && b!=a) || (a==c && b!=c)){
                System.out.println("Case "+i+": Isosceles");
            }
            else if(a!=b && b!=c && c!=a){
                System.out.println("Case "+i+": Scalene");
            }            
        }
    }
    
}
