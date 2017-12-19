import java.util.Scanner;
public class auto
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int k=key.nextInt();
    if(k>=1 && k<=100)
    {
      while(k>0)
      {
        int n=key.nextInt();
        if(n>=(-1000) && n<=1000)
        {
          n=n*567;
          n=n/9;
          n=n+7492;
          n=n*235;
          n=n/47;
          n=n-498;
          n=n/10;
          n=n%10;
          if(n<0)
          {
            n=n*(-1);
          }
          System.out.println(n);
        }
        k--;
      }
    }
  }
}