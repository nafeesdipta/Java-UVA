
package uva10038;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class UVA10038 {
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
        String s=br.readLine();
             StringTokenizer tokens = new StringTokenizer(s, " ");
    String[] splited = new String[tokens.countTokens()];
    int index = 0;
    while(tokens.hasMoreTokens()){
        splited[index] = tokens.nextToken();
        ++index;
    }
          int flag=0;int cur=0;int prev=0;
            for (int i = 0; i <splited.length; i++) {
                if(i+1<splited.length)
                { 
                        prev=cur;
                int c1=Integer.parseInt(splited[i]);
                int c2=Integer.parseInt(splited[i+1]);                
                 cur=Math.abs(c1-c2);               
                }
                if(i!=0){
                if(Math.abs(cur-prev)==1 || Math.abs(cur-prev)==0)
                {flag=1;}
                else{flag=0;break;}}
            }                    
            if(flag==1)
                {System.out.println("Jolly");}
                else{System.out.println("Not jolly");}
                }
    }
    
}
