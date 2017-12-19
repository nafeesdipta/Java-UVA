package u11713;

import java.util.Scanner;

public class U11713 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int t=key.nextInt();
        for (int i = 0; i < t; i++) {
            String s1=key.next();
            String s2=key.next();
            if(s1.length()!=s2.length())
            {
                System.out.println("No");
            }
            else
            {
                int flag=0;
                for (int j = 0; j < s1.length(); j++) {
                    if((Character)s1.charAt(j)==(Character)s2.charAt(j))
                    {
                    flag++;
                    }
                    else
                    {
                    if((Character)s1.charAt(j)=='a'|| (Character)s1.charAt(j)=='e' || (Character)s1.charAt(j)=='i'||(Character)s1.charAt(j)=='o'||(Character)s1.charAt(j)=='u')
                    {
                    if((Character)s2.charAt(j)=='a'|| (Character)s2.charAt(j)=='e' || (Character)s2.charAt(j)=='i'||(Character)s2.charAt(j)=='o'||(Character)s2.charAt(j)=='u')
                    {
                    flag++;
                    }
                    }
                    }
                }
                if(flag==s1.length())
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
        }
    }
    
}
