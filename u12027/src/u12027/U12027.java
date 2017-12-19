package u12027;

import java.util.Scanner;

public class U12027 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
        int i=key.nextInt();
        if(i==0)break;
        int c=0;int s=1;
        while(s<=i)
        {
        if(s*s<=i)
        {
        c++;s++;
        }
        else break;
        }
            //System.out.println(c);
            if(c/10>1)
            {
            String st=String.valueOf(c);
            String f=String.valueOf(st.charAt(0));
                for (int j = 1; j <st.length(); j++) {
                    f=f.concat("0");
                }
                System.out.println(f); 
            }
            else
                System.out.println(c);
        }
    }
    
}
