package uva11875;
import java.util.Scanner;
public class UVA11875 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int c=1;
        int t=key.nextInt();
        for (int i = 0; i <t; i++) {
            int p=key.nextInt();
            int [] man=new int[p];
            for (int j = 0; j <man.length; j++) {
                man[j]=key.nextInt();
            }
            System.out.println("Case "+c+": "+man[(man.length)/2]);
            c++;
        }
    }
    
}
