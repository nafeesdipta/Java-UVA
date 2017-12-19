package u10469;
import java.util.Scanner;
public class U10469 {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        while(key.hasNext())
        {
        int t=key.nextInt();
        int y=key.nextInt();
            System.out.println(t^y);
        }
    }
    
}
