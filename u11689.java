import java.util.Scanner;
public class u11689
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int t=key.nextInt();
    while(t>0)
    {
      int r=0;int sum=0;
      int e=key.nextInt();
      int f=key.nextInt();
      int c=key.nextInt();
      int u=e+f;
      while(u>0)
      {
        int v=u;
        u=u/c;
        r=r+(v%c);
        sum=sum+u;
        if(r+u>=c)
        {
          u=u+r;
          r=0;
        }
        if(u<c)
        {
          break;
        }
      }
        System.out.println(sum);
        t--;
      }
    }
  }
