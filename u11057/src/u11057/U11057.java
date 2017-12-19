package u11057;
import java.util.*;
public class U11057{    
    public static void main(String[] args){
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
        int b=key.nextInt();//how many books
        int man[]=new int[b];
            for (int i = 0; i <man.length; i++) {
                man[i]=key.nextInt();//price
            }
            int p=key.nextInt();//peters money
            //System.out.println();;//end of test case
            int dif=Integer.MAX_VALUE;
            {               
            int a=0;int c=0;
                for (int i = 0; i<man.length; i++) {                    
                    for (int j = i+1; j<man.length; j++) {
                        if(man[j]+man[i]==p && Math.abs(man[i]-man[j])<dif)
                        {
                            a=Math.max(man[i],man[j]);
                            c=Math.min(man[i], man[j]);
                            dif=Math.abs(a-c);                                                        
                        }                        
                    }             
                }
                System.out.println("Peter should buy books whose prices are "+c+" and "+a+".");
                System.out.println();
            }
        }
    }
}

