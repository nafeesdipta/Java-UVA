import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Uva673 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bf.readLine());
        while(t>0)
        {
            int flag=0;
            Stack a=new Stack();
        String s=bf.readLine().toString();
            for (int i = 0; i <s.length(); i++) 
            {
            if(s.charAt(i)=='('|| s.charAt(i)=='[')
            {
            a.push(s.charAt(i));
            }
            else
            {
            if(a.empty())
            {
                System.out.println("No");
            flag++;
            break;
            }
            else if(s.charAt(i)==')'&&(Character)a.peek()=='(')
            {
            a.pop();
            }
            else if(s.charAt(i)==']'&&(Character)a.peek()=='[')
            {
            a.pop();
            }
            }
            }
        if(a.empty()&&flag!=1)
        {
            System.out.println("Yes");
        }
        else if(!a.empty())
        {
            System.out.println("No");
        }
        t--;
        }
    }   
}
