
package u10921;

import java.util.Scanner;

public class U10921 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
        String s=key.next();
        String c="";
            for (int i = 0; i <s.length(); i++) {
                if((Character)s.charAt(i)=='1'|| (Character)s.charAt(i)=='0'|| (Character)s.charAt(i)=='-')
                {
               // c=c+c.concat(String.valueOf((Character)s.charAt(i)));
                    System.out.print((Character)s.charAt(i));
                }
                else if((Character)s.charAt(i)=='A' || (Character)s.charAt(i)=='B' || (Character)s.charAt(i)=='C')
                {
                    System.out.print(2);
                }
                else if((Character)s.charAt(i)=='D' || (Character)s.charAt(i)=='E' || (Character)s.charAt(i)=='F')
                {
                    System.out.print(3);
                }
                else if((Character)s.charAt(i)=='G' || (Character)s.charAt(i)=='H' || (Character)s.charAt(i)=='I')
                {
                    System.out.print(4);
                }
                else if((Character)s.charAt(i)=='J' || (Character)s.charAt(i)=='K' || (Character)s.charAt(i)=='L')
                {
                    System.out.print(5);
                }
                else if((Character)s.charAt(i)=='M' || (Character)s.charAt(i)=='N' || (Character)s.charAt(i)=='O')
                {
                    System.out.print(6);
                }
                else if((Character)s.charAt(i)=='P' || (Character)s.charAt(i)=='Q' || (Character)s.charAt(i)=='R' || (Character)s.charAt(i)=='S')
                {
                    System.out.print(7);
                }
                else if((Character)s.charAt(i)=='T' || (Character)s.charAt(i)=='U' || (Character)s.charAt(i)=='V')
                {
                    System.out.print(8);
                }
                else if((Character)s.charAt(i)=='W' || (Character)s.charAt(i)=='X' || (Character)s.charAt(i)=='Y'|| (Character)s.charAt(i)=='Z')
                {
                    System.out.print(9);
                }
            }
            System.out.println();
        }
    }
    
}
