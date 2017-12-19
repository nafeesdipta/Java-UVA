package compare;
import java.util.*;
public class Compare {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Song> sl=new ArrayList<Song>();
        Scanner key=new Scanner(System.in);
        for (int i = 0; i <2; i++) {
            String t=key.next();
            String a=key.next();
            int tt=key.nextInt();
            Song sn=new Song(t, a, tt);
            sl.add(sn);
        }
        Collections.sort(sl);
        System.out.println(sl);
        System.out.println(sl.get(0).title);
    }
    
}
