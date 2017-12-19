
package u10222;
import java.util.*;
public class U10222 {

    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        while(key.hasNext()){
        String s = key.nextLine();
        s=s.toLowerCase();
        String keyb= "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
            for (int i = 0; i <s.length(); i++) {
                if(s.charAt(i)==' ')
                {
                    System.out.print(" ");
                    //System.out.println("ss");
                }
                else{
                    System.out.print(keyb.charAt(keyb.indexOf(s.charAt(i))-2));
                }
                
            }
           System.out.println(); 
        }
    }
    
}
