package u12527;
import java.util.*;
public class U12527 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner br=new Scanner(System.in);
        
        while(br.hasNext())
        { 
            int c=0;int f=0;
        int i=br.nextInt();
        int j=br.nextInt();
            for (int k = i; k <=j; k++) {
                String s=String.valueOf(k);             
                for (int l = 0; l <s.length(); l++) {
                    if(l+1<=s.length())
                    {
                        for (int m = l+1; m <s.length(); m++) {
                            if(m+1<=s.length()){
                          if(s.charAt(l)==s.charAt(m))
                    {
                    c++;break;
                    }  
                            }
                        }                                            
                    }
                }
                if(c==0)
                {f++;}c=0;
            }
            System.out.println(f);
        }
    }
}
