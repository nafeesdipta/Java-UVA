package u11854;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U11854 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
//        String s=br.readLine();        
//            StringTokenizer st=new StringTokenizer(s," ");
//            double [] man=new double[3];int in=0;
//            while(st.hasMoreTokens())
//            {
//            man[in]=Double.parseDouble(st.nextToken());
//                in++;
//            }
            int [] man=new int[3];
            
            for (int i = 0; i <man.length; i++) {
                man[i]=key.nextInt();
            }
            if(man[0]==0 && man[1]==0 && man[2]==0){break;}
           Arrays.sort(man);
            if((man[0]*man[0])+(man[1]*man[1])==man[2]*man[2])
            {
                System.out.println("right");
            }
            else
            {
                System.out.println("wrong");
            }
        }
    }
    
}
