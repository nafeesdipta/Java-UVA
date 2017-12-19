package u1225;
import java.util.Scanner;
public class U1225 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();
        for (int i = 0; i <t; i++) {
            int a=key.nextInt();
            String s="";
            for (int j = 1; j <=a; j++) {
                s=s.concat(String.valueOf(j));
            }
            //System.out.println(s);
            int []man=new int[10];
            for (int j = 0; j <s.length(); j++) {
                int c=Character.getNumericValue(s.charAt(j));
                man[c]++;
            }
            for (int j = 0; j <man.length; j++) {                
                    System.out.print(man[j]);
                    if(j!=man.length-1)
                    {
                        System.out.print(" ");
                    }               
            }
          
            System.out.println();
        }
    }    
}
