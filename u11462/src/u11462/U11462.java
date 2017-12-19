package u11462;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U11462 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
           String k=br.readLine();           
            if(k.equals("0")){break;}
String s=br.readLine();
             StringTokenizer tokens = new StringTokenizer(s, " ");
    int [] man = new int[101];
    int [] count =new int [101];
    while(tokens.hasMoreTokens()){
        int t=Integer.parseInt(tokens.nextToken());
        if(man[t] ==1)
        {
        count[t]++; 
        }
        else{
        man[t] = 1;
        }
    }           int c=0;
            for (int i = 0; i <man.length; i++) {
                if(c==0 && man[i]==1)
                {
                    System.out.print(i);c=1; 
                    if(count[i]>0)
                    {
                    for (int j = 0; j <count[i]; j++) {
                        System.out.print(" "+i);
                    }
                    }
                } 
                else if(c!=0 && man[i]==1)
                for (int j = 0; j <=count[i]; j++) {
                        System.out.print(" "+i);
                    }
            }
            System.out.println();
        }
    }
    
}
