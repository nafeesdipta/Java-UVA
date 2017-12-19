package u10696;

import java.util.Scanner;

public class U10696 {
    
public static int f91(int x){
    if(x>100)
        return x-10;
    return f91(f91(x+11));
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
        int a=key.nextInt();
        if(a==0)
            break;
        f91(a);
            System.out.println("f91("+a+") = "+f91(a));
        }
    }
    
}
