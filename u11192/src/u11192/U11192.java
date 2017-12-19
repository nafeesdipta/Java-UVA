package u11192;
import java.util.Scanner;
public class U11192 {
public static void main(String[] args) {
        // TODO code application logic here
    Scanner key=new Scanner(System.in);
    while(key.hasNext())
    {
        int t=key.nextInt();
        if(t==0){break;}
    String s=key.next();    
    String rev="";
    String frev="";
    int c=s.length()/t;
        for (int i = 0; i <s.length(); i++) {
            if(i!=0 && i%c==0)
            {
            rev=new StringBuffer(rev).reverse().toString();
            frev=frev.concat(rev);
            rev="";
            rev=rev.concat(String.valueOf(s.charAt(i)));
            }
            else{
            rev=rev.concat(String.valueOf(s.charAt(i)));
        }
        }
        rev=new StringBuffer(rev).reverse().toString();
        frev=frev.concat(rev);
        System.out.println(frev);
    }
    }
    
}
