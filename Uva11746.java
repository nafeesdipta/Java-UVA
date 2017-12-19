package uva11746;
import java.util.*;
public class Uva11746 
{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();       
        for (int i = 1; i <=t; i++) {
            int h=0;int l=0;
            int w=key.nextInt();
            int man[]=new int[w];
            for (int j = 0; j < w; j++) {
                man[j]=key.nextInt();
            }
            for (int j = 0; j <man.length; j++) {
                if(j+1<man.length)
                {
                if(man[j]!=man[j+1]&& man[j]<man[j+1])
                {
                h++;
                }
                else if(man[j]!=man[j+1]&& man[j]>man[j+1])
                {
                l++;
                }
                }
            }
            System.out.println("Case "+i+": " +h+" "+l);
        }
    }
}
