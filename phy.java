import java.util.Scanner;
public class phy
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
while(key.hasNext())
{
      Long v=key.nextLong();
    Long t=key.nextLong();
      Long f=2*v*t;
      System.out.println(f);   
  }
  }
}