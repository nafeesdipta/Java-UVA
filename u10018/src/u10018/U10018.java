package u10018;
import java.util.Scanner;
public class U10018 {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();      
        while(t>0)
        {
        String s =key.next();
        String rev=new StringBuffer(s).reverse().toString();
        Long a=Long.parseLong(s);
        Long b=Long.parseLong(rev);
        Long x=a+b;
        String sum=String.valueOf(x);
        rev=new StringBuffer(sum).reverse().toString();
        int c=1;
            for (int i = 0; i < 1001; i++)                 
            {            
            if(sum.equals(rev))
            {
                System.out.println(c+" "+sum);break;
            }
            else
            {
            c++;
            rev=new StringBuffer(sum).reverse().toString();
            a=Long.parseLong(rev);
            b=Long.parseLong(sum);
            sum=String.valueOf(a+b);
            rev=new StringBuffer(sum).reverse().toString();
            }                    
        }
  t--;
    }
    
}
}

