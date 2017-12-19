package u10038;
import java.util.*;
public class U10038 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner br=new Scanner(System.in);
        while(br.hasNext())
        {
        int t=br.nextInt();
        int [] man=new int[t];
        Boolean[] a = new Boolean[t];
        Arrays.fill(a, Boolean.FALSE);
            for (int i = 0; i <man.length; i++) {
                man[i]=br.nextInt();
            }
            int flag=1;
            for (int i = 0; i <man.length; i++) {
                if(i+1<man.length)
                {
                    int c1=Math.abs(man[i]-man[i+1]);
                      if(c1<a.length){  
                       a[c1]=true;
                      }                                       
                }
            }                    
            for (int i = 1; i <a.length; i++) {
                if(a[i]==false)
                {flag++;break;}                
            }
            if(flag==1){System.out.println("Jolly");}
            else{System.out.println("Not jolly");}
        }
    }   
}
