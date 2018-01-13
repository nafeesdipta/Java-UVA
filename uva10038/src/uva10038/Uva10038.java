package uva10038;
import java.util.*;
public class Uva10038 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int d=0;
        
            int i=0;d=0;int flag=0;
            String s=key.next();
       int [] man=new int [s.length()];
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
        int j=Integer.parseInt(st.nextToken());
            man[i]=j;
            i++;
        }
            for (int j = 0; j <man.length; j++) 
            {
                if(j+1<i)
                {
                if(d==0)
                {                                
                d=man[j]-man[j+1];                             
                }
                else if(man[j]-man[j+1]!=Math.abs(d)||man[j]-man[j+1]!=Math.abs(--d))
                {
                flag++;
                } 
                }
            }
            if(flag==0)
            {
                System.out.println("Jolly");
            }
        else
            {
                System.out.println("Not jolly");
            }
        
    }
    
}
