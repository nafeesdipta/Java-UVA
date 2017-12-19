
package u11044;

import java.util.Scanner;

public class U11044 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();
        for (int i = 0; i <t; i++) {
            int n=key.nextInt();
            int m=key.nextInt();
            System.out.println(((n/3) * (m/3)));
        }
    }
    
}
