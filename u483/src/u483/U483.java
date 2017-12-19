package u483;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U483 {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));       
        Scanner br=new Scanner(System.in);
        while(br.hasNext()) 
        {
      String s=br.nextLine();
            StringTokenizer st=new StringTokenizer(s," ");
        String [] man=new String[st.countTokens()];
        int in=0;
        while(st.hasMoreTokens())
        {
        man[in]=st.nextToken();
        in++;
        }
        String rev=new StringBuffer(man[0]).reverse().toString();
            System.out.print(rev);
            for (int i = 1; i <man.length; i++) {
               rev=new StringBuffer(man[i]).reverse().toString();
                System.out.print(" "+rev);
            }
            System.out.println();
        }
    }
    
}
