package u10050;
import java.util.*;
public class U10050 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();
        while(t>0)
        {
        int d=key.nextInt();
        boolean [] a=new boolean[d+1];
        Arrays.fill(a,Boolean.FALSE);
        int p=key.nextInt();
        int [] man=new int[p+1];
            for (int i = 1; i <man.length; i++) {
                man[i]=key.nextInt();
            }
            for (int i =1; i <man.length; i++) {
                for (int j =man[i]; j <a.length; j=j+man[i]) {
                    if(j%7!=0&&(j+1)%7!=0)
                    {
                    a[j]=true;
                    }
                }
            }
            int f=0;
            for (int i = 1; i <a.length; i++) {
                if(a[i]==true){f++;}
            }
            System.out.println(f);
     t--;
        }    
}
}