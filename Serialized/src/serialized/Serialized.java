package serialized;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
public class Serialized {

    public static void main(String[] args) {
        // TODO code application logic here
        Box mybox = null;
        mybox = new Box(0, 0);
        mybox.width=50;
        mybox.height=50;
        System.out.println(mybox);
        try {
            FileOutputStream fs=new FileOutputStream("foo.ser");
            ObjectOutputStream os=new ObjectOutputStream(fs);
            os.writeObject(mybox);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
