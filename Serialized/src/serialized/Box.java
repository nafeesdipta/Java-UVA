package serialized;

import java.io.Serializable;

public class Box implements Serializable{
    public int width;
    public int height;
    public Box(int width,int height)
    {
    this.width=width;
    this.height=height;
    }

    
}
