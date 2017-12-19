package u591;
import java.util.Scanner;
public class U591 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);int n=1;
        while (true) {            
            int t =key.nextInt();
            if(t==0){break;}
            int [] man=new int[t];
            int sum=0;
            for (int i = 0; i <man.length; i++) {
                man[i]=key.nextInt();
                sum=sum+man[i];
            }
            int av=sum/t;int c=0;
            for (int i = 0; i <man.length; i++) {
                if(man[i]>av)
                {
                c=c+man[i]-av;
                }
            }
            System.out.println("Set #"+n);
            System.out.println("The minimum number of moves is "+c+".");
            System.out.println();
            n++;
        }
    }   
}