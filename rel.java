import java.util.Scanner;
public class rel
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int t=key.nextInt();
    while(t>0)
    {
      int a=key.nextInt();
      int b=key.nextInt();
      if(a<b)
      {
      System.out.println("<");
      }
      else if(a>b)
      {
      System.out.println(">");
      }
      else if(a==b)
      {
       System.out.println("=");
      }
      t--;
    }
  }
}