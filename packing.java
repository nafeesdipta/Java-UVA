import java.util.Scanner;
public class packing
{
  public static void main(String [] args)
  {
    Scanner key =new Scanner(System.in);
    int t=key.nextInt();
    int i=1;
    while(t>0)
    {
     int h=key.nextInt();
     int w=key.nextInt();
      int l=key.nextInt(); 
      if(h<=20 && w<=20 && l<=20)
      {
        System.out.println("Case "+i+":"+" good");
        i++;
      }
      else
      {
       System.out.println("Case "+i+":"+" bad");
       i++;
      }
      t--;
    }
  }
}